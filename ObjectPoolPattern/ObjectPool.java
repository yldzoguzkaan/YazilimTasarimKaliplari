package ObjectPoolPattern;

import java.util.HashSet;
import java.util.Set;

/**
 * Generic object pool.
 *
 * @param <T> Type T of Object in the Pool
 */
public abstract class ObjectPool<T> {
	private Set<T> available = new HashSet<>();
	private Set<T> inUse = new HashSet<>();
	protected abstract T create();
	
	public synchronized T checkOut() {
		if (available.isEmpty()) {
			available.add(create());
		}
		T instance = available.iterator().next();
		available.remove(instance);
		inUse.add(instance);
		return instance;
	}

	public synchronized void checkIn(T instance) {
		inUse.remove(instance);
		available.add(instance);
	}

	@Override
	public synchronized String toString() {
		return String.format("Kullanilabilir Havuz Sayisi: %d Kullanilan Havuz Sayisi: %d", available.size(),
				inUse.size());
	}
}