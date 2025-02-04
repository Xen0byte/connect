/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * 
 * http://www.mirthcorp.com
 * 
 * The software in this package is published under the terms of the MPL license a copy of which has
 * been included with this distribution in the LICENSE.txt file.
 */

package com.mirth.connect.server;

public class ManifestDirectory implements ManifestEntry {
    private String dir;
    private String includePrefix;
    private String excludePrefix;
    private String[] excludes = new String[0];

    public ManifestDirectory(String dir) {
        this.dir = dir;
    }

    public String getName() {
        return dir;
    }

    public String getIncludePrefix() {
        return includePrefix;
    }

    public void setIncludePrefix(String includePrefix) {
        this.includePrefix = includePrefix;
    }

    public String getExcludePrefix() {
        return excludePrefix;
    }

    public void setExcludePrefix(String excludePrefix) {
        this.excludePrefix = excludePrefix;
    }

    public String[] getExcludes() {
        return excludes;
    }

    public void setExcludes(String[] excludes) {
        this.excludes = excludes;
    }
}