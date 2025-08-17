package fsimpl;

import java.util.Arrays;

/* renamed from: fsimpl.r, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C14120r {

    /* renamed from: a, reason: collision with root package name */
    final long f132366a;

    /* renamed from: b, reason: collision with root package name */
    final String f132367b;

    C14120r(long j10, String str) {
        this.f132366a = j10;
        this.f132367b = str;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C14120r c14120r = (C14120r) obj;
        return this.f132366a == c14120r.f132366a && fu$$ExternalSyntheticBackport0.m(this.f132367b, c14120r.f132367b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f132366a), this.f132367b});
    }
}
