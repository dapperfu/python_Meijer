package com.bumptech.glide;

import com.bumptech.glide.l;
import n7.C15782a;

/* loaded from: classes4.dex */
public abstract class l<CHILD extends l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private n7.c<? super TranscodeType> f63746a = C15782a.b();

    final n7.c<? super TranscodeType> b() {
        return this.f63746a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return p7.l.d(this.f63746a, ((l) obj).f63746a);
        }
        return false;
    }

    public int hashCode() {
        n7.c<? super TranscodeType> cVar = this.f63746a;
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
