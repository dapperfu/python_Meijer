package Mn;

import Dl.e;
import Mn.c;
import android.content.Context;
import com.meijer.mobile.widget.WalkThroughView;
import com.meijer.mobile.widget.x;
import hi.InterfaceC14523a;
import xu.C18225c;
import yo.C18335a;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: Mn.a$a, reason: collision with other inner class name */
    private static final class C0357a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f20373a;

        /* renamed from: b, reason: collision with root package name */
        private d f20374b;

        private C0357a() {
        }

        @Override // Mn.c.a
        public c build() {
            C18225c.a(this.f20373a, Context.class);
            C18225c.a(this.f20374b, d.class);
            return new b(this.f20374b, this.f20373a);
        }

        @Override // Mn.c.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0357a a(d dVar) {
            this.f20374b = (d) C18225c.b(dVar);
            return this;
        }

        @Override // Mn.c.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C0357a b(Context context) {
            this.f20373a = (Context) C18225c.b(context);
            return this;
        }
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final d f20375a;

        /* renamed from: b, reason: collision with root package name */
        private final b f20376b = this;

        private WalkThroughView b(WalkThroughView walkThroughView) {
            x.b(walkThroughView, (C18335a) C18225c.c(this.f20375a.g()));
            x.c(walkThroughView, (e) C18225c.c(this.f20375a.e()));
            x.a(walkThroughView, (InterfaceC14523a) C18225c.c(this.f20375a.a()));
            return walkThroughView;
        }

        b(d dVar, Context context) {
            this.f20375a = dVar;
        }

        @Override // Mn.c
        public void a(WalkThroughView walkThroughView) {
            b(walkThroughView);
        }
    }

    public static c.a a() {
        return new C0357a();
    }
}
