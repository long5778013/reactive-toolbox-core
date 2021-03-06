package org.reactivetoolbox.core.lang;

public interface CollectionBuilder<T extends Collection, E> {
    CollectionBuilder<T, E> append(final E element);
    CollectionBuilder<T, E> append(final E ... elements);
    T build();
}
