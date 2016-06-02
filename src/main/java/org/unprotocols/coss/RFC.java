/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.unprotocols.coss;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Point to the RFC being implemented
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RFC {
    /**
     * @return RFC URL
     */
    String url();
    /**
     * @return Free-form revision identifier. Could be a date, source code versioning commit or tag,
     * version. Useful for lifecycle stages before {@link Stable}. <code>latest</code> by default, which is the weakest
     * form of a revision identifier.
     */
    String revision() default "latest";
}
