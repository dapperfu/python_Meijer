package Ln;

import Cl.e;
import Ln.c;
import android.content.Context;
import com.meijer.mobile.widget.WalkThroughView;
import com.meijer.mobile.widget.x;
import gi.InterfaceC14261a;
import yo.C18264a;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: Ln.a$a, reason: collision with other inner class name */
    private static final class C0315a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f18564a;

        /* renamed from: b, reason: collision with root package name */
        private d f18565b;

        private C0315a() {
        }

        @Override // Ln.c.a
        public c build() {
            Bu.c.a(this.f18564a, Context.class);
            Bu.c.a(this.f18565b, d.class);
            return new b(this.f18565b, this.f18564a);
        }

        @Override // Ln.c.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0315a a(d dVar) {
            this.f18565b = (d) Bu.c.b(dVar);
            return this;
        }

        @Override // Ln.c.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C0315a b(Context context) {
            this.f18564a = (Context) Bu.c.b(context);
            return this;
        }
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final d f18566a;

        /* renamed from: b, reason: collision with root package name */
        private final b f18567b = this;

        private WalkThroughView b(WalkThroughView walkThroughView) {
            x.b(walkThroughView, (C18264a) Bu.c.c(this.f18566a.g()));
            x.c(walkThroughView, (e) Bu.c.c(this.f18566a.e()));
            x.a(walkThroughView, (InterfaceC14261a) Bu.c.c(this.f18566a.a()));
            return walkThroughView;
        }

        b(d dVar, Context context) {
            this.f18566a = dVar;
        }

        @Override // Ln.c
        public void a(WalkThroughView walkThroughView) {
            b(walkThroughView);
        }
    }

    public static c.a a() {
        return new C0315a();
    }
}
