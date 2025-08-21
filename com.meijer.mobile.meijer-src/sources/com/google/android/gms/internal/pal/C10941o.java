package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10941o extends lf {
    C10941o() {
    }

    private static final C10796ef e(F f10, int i10) throws IOException {
        int i11 = i10 - 1;
        if (i11 == 5) {
            return new jf(f10.zzd());
        }
        if (i11 == 6) {
            return new jf(new of(f10.zzd()));
        }
        if (i11 == 7) {
            return new jf(Boolean.valueOf(f10.l()));
        }
        if (i11 == 8) {
            f10.i();
            return gf.f83981a;
        }
        G.a(i10);
        throw new IllegalStateException("Unexpected token: ".concat(G.a(i10)));
    }

    private static final C10796ef f(F f10, int i10) throws IOException {
        int i11 = i10 - 1;
        if (i11 == 0) {
            f10.zze();
            return new C10779df();
        }
        if (i11 != 2) {
            return null;
        }
        f10.d();
        return new hf();
    }

    @Override // com.google.android.gms.internal.pal.lf
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void b(H h10, C10796ef c10796ef) throws IOException {
        if (c10796ef == null || (c10796ef instanceof gf)) {
            h10.h();
            return;
        }
        if (c10796ef instanceof jf) {
            jf jfVar = (jf) c10796ef;
            if (jfVar.l()) {
                h10.i(jfVar.h());
                return;
            } else if (jfVar.k()) {
                h10.l(jfVar.zzc());
                return;
            } else {
                h10.j(jfVar.e());
                return;
            }
        }
        if (c10796ef instanceof C10779df) {
            h10.a();
            Iterator it = ((C10779df) c10796ef).iterator();
            while (it.hasNext()) {
                b(h10, (C10796ef) it.next());
            }
            h10.c();
            return;
        }
        if (!(c10796ef instanceof hf)) {
            Class<?> cls = c10796ef.getClass();
            cls.toString();
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(cls)));
        }
        h10.b();
        for (Map.Entry entry : c10796ef.f().m()) {
            h10.g((String) entry.getKey());
            b(h10, (C10796ef) entry.getValue());
        }
        h10.d();
    }

    @Override // com.google.android.gms.internal.pal.lf
    public final /* bridge */ /* synthetic */ Object a(F f10) throws IOException {
        String strC;
        C10796ef c10796efE;
        int iM = f10.m();
        C10796ef c10796efF = f(f10, iM);
        if (c10796efF == null) {
            return e(f10, iM);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (f10.j()) {
                if (c10796efF instanceof hf) {
                    strC = f10.c();
                } else {
                    strC = null;
                }
                int iM2 = f10.m();
                C10796ef c10796efF2 = f(f10, iM2);
                if (c10796efF2 == null) {
                    c10796efE = e(f10, iM2);
                } else {
                    c10796efE = c10796efF2;
                }
                if (c10796efF instanceof C10779df) {
                    ((C10779df) c10796efF).l(c10796efE);
                } else {
                    ((hf) c10796efF).n(strC, c10796efE);
                }
                if (c10796efF2 != null) {
                    arrayDeque.addLast(c10796efF);
                    c10796efF = c10796efE;
                }
            } else {
                if (c10796efF instanceof C10779df) {
                    f10.g();
                } else {
                    f10.h();
                }
                if (!arrayDeque.isEmpty()) {
                    c10796efF = (C10796ef) arrayDeque.removeLast();
                } else {
                    return c10796efF;
                }
            }
        }
    }
}
