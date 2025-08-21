package com.bugsnag.android;

import com.bugsnag.android.C6624v0;
import java.util.Date;
import java.util.Map;

/* loaded from: classes4.dex */
public class Breadcrumb implements C6624v0.a {
    final C6608n impl;
    private final D0 logger;

    Breadcrumb(C6608n c6608n, D0 d02) {
        this.impl = c6608n;
        this.logger = d02;
    }

    private void logNull(String str) {
        this.logger.e("Invalid null value supplied to breadcrumb." + str + ", ignoring");
    }

    public String getMessage() {
        return this.impl.message;
    }

    public Map<String, Object> getMetadata() {
        return this.impl.metadata;
    }

    String getStringTimestamp() {
        return R6.g.c(this.impl.timestamp);
    }

    public Date getTimestamp() {
        return this.impl.timestamp;
    }

    public BreadcrumbType getType() {
        return this.impl.type;
    }

    public void setMessage(String str) {
        if (str != null) {
            this.impl.message = str;
        } else {
            logNull("message");
        }
    }

    public void setMetadata(Map<String, Object> map) {
        this.impl.metadata = map;
    }

    public void setType(BreadcrumbType breadcrumbType) {
        if (breadcrumbType != null) {
            this.impl.type = breadcrumbType;
        } else {
            logNull("type");
        }
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 c6624v0) throws Throwable {
        this.impl.toStream(c6624v0);
    }

    Breadcrumb(String str, D0 d02) {
        this.impl = new C6608n(str);
        this.logger = d02;
    }

    Breadcrumb(String str, BreadcrumbType breadcrumbType, Map<String, Object> map, Date date, D0 d02) {
        this.impl = new C6608n(str, breadcrumbType, map, date);
        this.logger = d02;
    }
}
