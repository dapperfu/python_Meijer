package v8;

import I7.i;
import I7.j;
import android.content.Context;
import x8.C18024b;
import y8.C18189b;

/* loaded from: classes4.dex */
public class e implements I7.h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f164605a;

    @Override // I7.h
    public j a() {
        return new g();
    }

    @Override // I7.h
    public i b() {
        return new i() { // from class: v8.d
            @Override // I7.i
            public final void a(String str, String str2) {
                C18189b.a(str, str2);
            }
        };
    }

    @Override // I7.h
    public I7.g c() {
        return new C17523c(new u8.e(this.f164605a, new C18024b()), u8.f.b(this.f164605a));
    }

    public e(Context context) {
        this.f164605a = context;
    }
}
