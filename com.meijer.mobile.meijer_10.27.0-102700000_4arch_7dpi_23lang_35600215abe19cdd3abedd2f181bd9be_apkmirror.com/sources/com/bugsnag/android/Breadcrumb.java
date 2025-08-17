package com.bugsnag.android;

import com.bugsnag.android.C6482m0;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

/* loaded from: classes4.dex */
public class Breadcrumb implements C6482m0.a {
    final C6477k impl;
    private final InterfaceC6495t0 logger;

    Breadcrumb(C6477k c6477k, InterfaceC6495t0 interfaceC6495t0) {
        this.impl = c6477k;
        this.logger = interfaceC6495t0;
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
        return Q6.d.c(this.impl.timestamp);
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

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 c6482m0) throws IOException {
        this.impl.toStream(c6482m0);
    }

    Breadcrumb(String str, InterfaceC6495t0 interfaceC6495t0) {
        this.impl = new C6477k(str);
        this.logger = interfaceC6495t0;
    }

    Breadcrumb(String str, BreadcrumbType breadcrumbType, Map<String, Object> map, Date date, InterfaceC6495t0 interfaceC6495t0) {
        this.impl = new C6477k(str, breadcrumbType, map, date);
        this.logger = interfaceC6495t0;
    }
}
