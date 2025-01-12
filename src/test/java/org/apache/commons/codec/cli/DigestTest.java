/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.codec.cli;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Tests {@link Digest}.
 */
public class DigestTest {

    /**
     * Tests if the main method is handled correctly.
     */
    @Test
    public void testMain() {
        assertThrows(NullPointerException.class, () -> Digest.main(new String[] { null }));
    }

    /**
     * Tests if the main method is handled correctly.
     */
    @Test
    public void testMain2() {
        assertThrows(IllegalArgumentException.class, () -> Digest.main(new String[] { }));
    }

    /**
     * Tests if the main method is handled correctly.
     */
    @Test
    public void testMain3() {
        assertThrows(IllegalArgumentException.class, () -> Digest.main(new String[] { "arg0" }));
    }

    /**
     * Tests if the main method is handled correctly.
     */
    @Test
    public void testMain4() {
        assertThrows(IllegalArgumentException.class, () -> Digest.main(new String[] { "arg0", "arg1" }));
    }

    /**
     * Tests if the main method is handled correctly.
     */
    @Test
    public void testMain5() {
        assertThrows(IllegalArgumentException.class, () -> Digest.main(new String[] { "arg0", "arg1", "arg2" }));
    }

    /**
     * Tests if the main method is handled correctly.
     */
    @Test
    public void testMain6() {
        assertThrows(IllegalArgumentException.class, () -> Digest.main(new String[] { "arg0", "arg1", "arg2", "arg3" }));
    }

    /**
     * Tests if the main method is handled correctly.
     */
    @Test
    public void testMain7() {
        assertThrows(IllegalArgumentException.class, () -> Digest.main(new String[] { "arg0", "arg1", "arg2", "arg3", "arg4" }));
    }

    /**
     * Tests if the main method is handled correctly.
     */
    @Test
    public void testMain8() {
        assertThrows(IllegalArgumentException.class, () -> Digest.main(new String[] { "arg0", "arg1", "arg2", "arg3", "arg4", "arg5" }));
    }

    /**
     * Tests if the main method is handled correctly.
     */
    @Test
    public void testMain9() {
        assertThrows(IllegalArgumentException.class, () -> Digest.main(new String[] { "arg0", "arg1", "arg2", "arg3", "arg4", "arg5", "arg6" }));
    }

    /**
     * Tests if the main method is handled correctly.
     */
    /**
     * Tests if empty arguments are handled correctly.
     */
    @Test
    public void testEmptyArguments() {
        assertThrows(IllegalArgumentException.class, () -> Digest.main(new String[0]));
    }
    /**
     * Tests if null arguments are handled correctly.
     */
    @Test
    public void testNullArguments() {
        assertThrows(NullPointerException.class, () -> Digest.main(null));
    }
}
