package com.bumptech.glide;

import com.bumptech.glide.l;
import p7.C16410a;

/* loaded from: classes4.dex */
public abstract class l<CHILD extends l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private p7.c<? super TranscodeType> f64586a = C16410a.b();

    final p7.c<? super TranscodeType> b() {
        return this.f64586a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return r7.l.d(this.f64586a, ((l) obj).f64586a);
        }
        return false;
    }

    public int hashCode() {
        p7.c<? super TranscodeType> cVar = this.f64586a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
