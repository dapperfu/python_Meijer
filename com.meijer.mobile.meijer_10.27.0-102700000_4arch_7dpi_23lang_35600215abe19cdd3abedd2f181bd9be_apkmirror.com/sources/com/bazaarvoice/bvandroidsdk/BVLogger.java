package com.bazaarvoice.bvandroidsdk;

import com.fullstory.FS;

/* loaded from: classes4.dex */
class BVLogger {
    final BVLogLevel bvLogLevel;

    public void e(String str, String str2) {
        FS.log_e(str, str2);
    }

    public void w(String str, String str2) {
        if (this.bvLogLevel.greaterOrEqualPriorityThan(BVLogLevel.WARNING)) {
            FS.log_w(str, str2);
        }
    }

    public void d(String str, String str2) {
        if (this.bvLogLevel.greaterOrEqualPriorityThan(BVLogLevel.VERBOSE)) {
            FS.log_d(str, str2);
        }
    }

    public void e(String str, String str2, Throwable th2) {
        FS.log_e(str, str2, th2);
    }

    public void i(String str, String str2) {
        if (this.bvLogLevel.greaterOrEqualPriorityThan(BVLogLevel.INFO)) {
            FS.log_i(str, str2);
        }
    }

    public void v(String str, String str2) {
        if (this.bvLogLevel.greaterOrEqualPriorityThan(BVLogLevel.VERBOSE)) {
            FS.log_v(str, str2);
        }
    }

    BVLogger(BVLogLevel bVLogLevel) {
        this.bvLogLevel = bVLogLevel;
    }

    public void w(String str, String str2, Throwable th2) {
        if (this.bvLogLevel.greaterOrEqualPriorityThan(BVLogLevel.WARNING)) {
            FS.log_w(str, str2, th2);
        }
    }
}
