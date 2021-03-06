package org.reactivetoolbox.core.examples.async.services;

import org.reactivetoolbox.core.async.Promise;
import org.reactivetoolbox.core.examples.async.domain.Order;
import org.reactivetoolbox.core.examples.async.domain.User;
import org.reactivetoolbox.core.lang.Collection;

public interface CommentService {
    Promise<Collection<org.reactivetoolbox.core.examples.async.domain.Comment>> commentsByUser(final User.Id userId, final Order order);
}
