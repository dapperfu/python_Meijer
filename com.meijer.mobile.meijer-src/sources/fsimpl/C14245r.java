package fsimpl;

import java.util.Arrays;

/* renamed from: fsimpl.r, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14245r {

    /* renamed from: a, reason: collision with root package name */
    final long f133616a;

    /* renamed from: b, reason: collision with root package name */
    final String f133617b;

    C14245r(long j10, String str) {
        this.f133616a = j10;
        this.f133617b = str;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C14245r c14245r = (C14245r) obj;
        return this.f133616a == c14245r.f133616a && fu$$ExternalSyntheticBackport0.m(this.f133617b, c14245r.f133617b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f133616a), this.f133617b});
    }
}
