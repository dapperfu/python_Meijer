package x8;

import K7.i;
import K7.j;
import android.content.Context;
import z8.C18461b;

/* loaded from: classes4.dex */
public class e implements K7.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f170641a;

    @Override // K7.h
    public j a() {
        return new g();
    }

    @Override // K7.h
    public i b() {
        return new i() { // from class: x8.d
            @Override // K7.i
            public final void a(String str, String str2) {
                A8.b.a(str, str2);
            }
        };
    }

    @Override // K7.h
    public K7.g c() {
        return new C18135c(new w8.e(this.f170641a, new C18461b()), w8.f.b(this.f170641a));
    }

    public e(Context context) {
        this.f170641a = context;
    }
}
