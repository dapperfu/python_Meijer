package androidx.media3.ui;

import Ce.L;
import a3.B;
import a3.F;
import a3.G;
import a3.H;
import a3.I;
import a3.J;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.ui.D;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b2.C6187h;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d3.C13466a;
import d3.E;
import d3.P;
import h4.C14346A;
import h4.C14347B;
import h4.C14348C;
import h4.C14349D;
import h4.C14355e;
import h4.C14369s;
import h4.C14371u;
import h4.C14372v;
import h4.C14373w;
import h4.C14374x;
import h4.C14375y;
import h4.C14376z;
import h4.InterfaceC14350E;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class PlayerControlView extends FrameLayout {

    /* renamed from: A0, reason: collision with root package name */
    private static final float[] f57373A0;

    /* renamed from: A, reason: collision with root package name */
    private final View f57374A;

    /* renamed from: B, reason: collision with root package name */
    private final View f57375B;

    /* renamed from: C, reason: collision with root package name */
    private final TextView f57376C;

    /* renamed from: D, reason: collision with root package name */
    private final TextView f57377D;

    /* renamed from: E, reason: collision with root package name */
    private final D f57378E;

    /* renamed from: F, reason: collision with root package name */
    private final StringBuilder f57379F;

    /* renamed from: G, reason: collision with root package name */
    private final Formatter f57380G;

    /* renamed from: H, reason: collision with root package name */
    private final F.b f57381H;

    /* renamed from: I, reason: collision with root package name */
    private final F.c f57382I;

    /* renamed from: J, reason: collision with root package name */
    private final Runnable f57383J;

    /* renamed from: K, reason: collision with root package name */
    private final Drawable f57384K;

    /* renamed from: L, reason: collision with root package name */
    private final Drawable f57385L;

    /* renamed from: M, reason: collision with root package name */
    private final Drawable f57386M;

    /* renamed from: N, reason: collision with root package name */
    private final Drawable f57387N;

    /* renamed from: O, reason: collision with root package name */
    private final Drawable f57388O;

    /* renamed from: P, reason: collision with root package name */
    private final String f57389P;

    /* renamed from: Q, reason: collision with root package name */
    private final String f57390Q;

    /* renamed from: R, reason: collision with root package name */
    private final String f57391R;

    /* renamed from: S, reason: collision with root package name */
    private final Drawable f57392S;

    /* renamed from: T, reason: collision with root package name */
    private final Drawable f57393T;

    /* renamed from: U, reason: collision with root package name */
    private final float f57394U;

    /* renamed from: V, reason: collision with root package name */
    private final float f57395V;

    /* renamed from: W, reason: collision with root package name */
    private final String f57396W;

    /* renamed from: a, reason: collision with root package name */
    private final t f57397a;

    /* renamed from: a0, reason: collision with root package name */
    private final String f57398a0;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f57399b;

    /* renamed from: b0, reason: collision with root package name */
    private final Drawable f57400b0;

    /* renamed from: c, reason: collision with root package name */
    private final c f57401c;

    /* renamed from: c0, reason: collision with root package name */
    private final Drawable f57402c0;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList<m> f57403d;

    /* renamed from: d0, reason: collision with root package name */
    private final String f57404d0;

    /* renamed from: e, reason: collision with root package name */
    private final RecyclerView f57405e;

    /* renamed from: e0, reason: collision with root package name */
    private final String f57406e0;

    /* renamed from: f, reason: collision with root package name */
    private final h f57407f;

    /* renamed from: f0, reason: collision with root package name */
    private final Drawable f57408f0;

    /* renamed from: g, reason: collision with root package name */
    private final e f57409g;

    /* renamed from: g0, reason: collision with root package name */
    private final Drawable f57410g0;

    /* renamed from: h, reason: collision with root package name */
    private final j f57411h;

    /* renamed from: h0, reason: collision with root package name */
    private final String f57412h0;

    /* renamed from: i, reason: collision with root package name */
    private final b f57413i;

    /* renamed from: i0, reason: collision with root package name */
    private final String f57414i0;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC14350E f57415j;

    /* renamed from: j0, reason: collision with root package name */
    private a3.B f57416j0;

    /* renamed from: k, reason: collision with root package name */
    private final PopupWindow f57417k;

    /* renamed from: k0, reason: collision with root package name */
    private d f57418k0;

    /* renamed from: l, reason: collision with root package name */
    private final int f57419l;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f57420l0;

    /* renamed from: m, reason: collision with root package name */
    private final ImageView f57421m;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f57422m0;

    /* renamed from: n, reason: collision with root package name */
    private final ImageView f57423n;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f57424n0;

    /* renamed from: o, reason: collision with root package name */
    private final ImageView f57425o;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f57426o0;

    /* renamed from: p, reason: collision with root package name */
    private final View f57427p;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f57428p0;

    /* renamed from: q, reason: collision with root package name */
    private final View f57429q;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f57430q0;

    /* renamed from: r, reason: collision with root package name */
    private final TextView f57431r;

    /* renamed from: r0, reason: collision with root package name */
    private int f57432r0;

    /* renamed from: s, reason: collision with root package name */
    private final TextView f57433s;

    /* renamed from: s0, reason: collision with root package name */
    private int f57434s0;

    /* renamed from: t, reason: collision with root package name */
    private final ImageView f57435t;

    /* renamed from: t0, reason: collision with root package name */
    private int f57436t0;

    /* renamed from: u, reason: collision with root package name */
    private final ImageView f57437u;

    /* renamed from: u0, reason: collision with root package name */
    private long[] f57438u0;

    /* renamed from: v, reason: collision with root package name */
    private final ImageView f57439v;

    /* renamed from: v0, reason: collision with root package name */
    private boolean[] f57440v0;

    /* renamed from: w, reason: collision with root package name */
    private final ImageView f57441w;

    /* renamed from: w0, reason: collision with root package name */
    private long[] f57442w0;

    /* renamed from: x, reason: collision with root package name */
    private final ImageView f57443x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean[] f57444x0;

    /* renamed from: y, reason: collision with root package name */
    private final ImageView f57445y;

    /* renamed from: y0, reason: collision with root package name */
    private long f57446y0;

    /* renamed from: z, reason: collision with root package name */
    private final View f57447z;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f57448z0;

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends l {
        private b() {
            super();
        }

        private boolean l(I i10) {
            for (int i11 = 0; i11 < this.f57469a.size(); i11++) {
                if (i10.f43681D.containsKey(this.f57469a.get(i11).f57466a.a())) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void k(b bVar, View view) {
            if (PlayerControlView.this.f57416j0 == null || !PlayerControlView.this.f57416j0.v(29)) {
                return;
            }
            ((a3.B) P.h(PlayerControlView.this.f57416j0)).M(PlayerControlView.this.f57416j0.A().a().G(1).P(1, false).F());
            PlayerControlView.this.f57407f.h(1, PlayerControlView.this.getResources().getString(C14347B.f134275w));
            PlayerControlView.this.f57417k.dismiss();
        }

        @Override // androidx.media3.ui.PlayerControlView.l
        public void h(i iVar) {
            iVar.f57463a.setText(C14347B.f134275w);
            iVar.f57464b.setVisibility(l(((a3.B) C13466a.e(PlayerControlView.this.f57416j0)).A()) ? 4 : 0);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.b.k(this.f57543a, view);
                }
            });
        }

        @Override // androidx.media3.ui.PlayerControlView.l
        public void j(String str) {
            PlayerControlView.this.f57407f.h(1, str);
        }

        public void m(List<k> list) {
            this.f57469a = list;
            I iA = ((a3.B) C13466a.e(PlayerControlView.this.f57416j0)).A();
            if (list.isEmpty()) {
                PlayerControlView.this.f57407f.h(1, PlayerControlView.this.getResources().getString(C14347B.f134276x));
                return;
            }
            if (!l(iA)) {
                PlayerControlView.this.f57407f.h(1, PlayerControlView.this.getResources().getString(C14347B.f134275w));
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                k kVar = list.get(i10);
                if (kVar.a()) {
                    PlayerControlView.this.f57407f.h(1, kVar.f57468c);
                    return;
                }
            }
        }
    }

    private final class c implements B.d, D.a, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
        }

        @Override // a3.B.d
        public void M0(a3.B b10, B.c cVar) {
            if (cVar.a(4, 5, 13)) {
                PlayerControlView.this.u0();
            }
            if (cVar.a(4, 5, 7, 13)) {
                PlayerControlView.this.w0();
            }
            if (cVar.a(8, 13)) {
                PlayerControlView.this.x0();
            }
            if (cVar.a(9, 13)) {
                PlayerControlView.this.B0();
            }
            if (cVar.a(8, 9, 11, 0, 16, 17, 13)) {
                PlayerControlView.this.t0();
            }
            if (cVar.a(11, 0, 13)) {
                PlayerControlView.this.C0();
            }
            if (cVar.a(12, 13)) {
                PlayerControlView.this.v0();
            }
            if (cVar.a(2, 13)) {
                PlayerControlView.this.D0();
            }
        }

        @Override // androidx.media3.ui.D.a
        public void B(D d10, long j10) {
            PlayerControlView.this.f57430q0 = true;
            if (PlayerControlView.this.f57377D != null) {
                PlayerControlView.this.f57377D.setText(P.k0(PlayerControlView.this.f57379F, PlayerControlView.this.f57380G, j10));
            }
            PlayerControlView.this.f57397a.R();
        }

        @Override // androidx.media3.ui.D.a
        public void E(D d10, long j10) {
            if (PlayerControlView.this.f57377D != null) {
                PlayerControlView.this.f57377D.setText(P.k0(PlayerControlView.this.f57379F, PlayerControlView.this.f57380G, j10));
            }
        }

        @Override // androidx.media3.ui.D.a
        public void G(D d10, long j10, boolean z10) {
            PlayerControlView.this.f57430q0 = false;
            if (!z10 && PlayerControlView.this.f57416j0 != null) {
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.l0(playerControlView.f57416j0, j10);
            }
            PlayerControlView.this.f57397a.S();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a3.B b10 = PlayerControlView.this.f57416j0;
            if (b10 == null) {
                return;
            }
            PlayerControlView.this.f57397a.S();
            if (PlayerControlView.this.f57423n == view) {
                if (b10.v(9)) {
                    b10.B();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f57421m == view) {
                if (b10.v(7)) {
                    b10.p();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f57427p == view) {
                if (b10.U() == 4 || !b10.v(12)) {
                    return;
                }
                b10.d0();
                return;
            }
            if (PlayerControlView.this.f57429q == view) {
                if (b10.v(11)) {
                    b10.e0();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f57425o == view) {
                P.t0(b10, PlayerControlView.this.f57426o0);
                return;
            }
            if (PlayerControlView.this.f57435t == view) {
                if (b10.v(15)) {
                    b10.X(E.a(b10.a0(), PlayerControlView.this.f57436t0));
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f57437u == view) {
                if (b10.v(14)) {
                    b10.G(!b10.b0());
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f57447z == view) {
                PlayerControlView.this.f57397a.R();
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.V(playerControlView.f57407f, PlayerControlView.this.f57447z);
                return;
            }
            if (PlayerControlView.this.f57374A == view) {
                PlayerControlView.this.f57397a.R();
                PlayerControlView playerControlView2 = PlayerControlView.this;
                playerControlView2.V(playerControlView2.f57409g, PlayerControlView.this.f57374A);
            } else if (PlayerControlView.this.f57375B == view) {
                PlayerControlView.this.f57397a.R();
                PlayerControlView playerControlView3 = PlayerControlView.this;
                playerControlView3.V(playerControlView3.f57413i, PlayerControlView.this.f57375B);
            } else if (PlayerControlView.this.f57441w == view) {
                PlayerControlView.this.f57397a.R();
                PlayerControlView playerControlView4 = PlayerControlView.this;
                playerControlView4.V(playerControlView4.f57411h, PlayerControlView.this.f57441w);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (PlayerControlView.this.f57448z0) {
                PlayerControlView.this.f57397a.S();
            }
        }
    }

    @Deprecated
    public interface d {
        void E(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e extends RecyclerView.h<i> {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f57451a;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f57452b;

        /* renamed from: c, reason: collision with root package name */
        private int f57453c;

        public void i(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.f57452b;
                if (i10 >= fArr.length) {
                    this.f57453c = i11;
                    return;
                }
                float fAbs = Math.abs(f10 - fArr[i10]);
                if (fAbs < f11) {
                    i11 = i10;
                    f11 = fAbs;
                }
                i10++;
            }
        }

        public e(String[] strArr, float[] fArr) {
            this.f57451a = strArr;
            this.f57452b = fArr;
        }

        public static /* synthetic */ void a(e eVar, int i10, View view) {
            if (i10 != eVar.f57453c) {
                PlayerControlView.this.setPlaybackSpeed(eVar.f57452b[i10]);
            }
            PlayerControlView.this.f57417k.dismiss();
        }

        public String c() {
            return this.f57451a[this.f57453c];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, final int i10) {
            String[] strArr = this.f57451a;
            if (i10 < strArr.length) {
                iVar.f57463a.setText(strArr[i10]);
            }
            if (i10 == this.f57453c) {
                iVar.itemView.setSelected(true);
                iVar.f57464b.setVisibility(0);
            } else {
                iVar.itemView.setSelected(false);
                iVar.f57464b.setVisibility(4);
            }
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.e.a(this.f57544a, i10, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f57451a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(C14376z.f134446f, viewGroup, false));
        }
    }

    public interface f {
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class g extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f57455a;

        /* renamed from: b, reason: collision with root package name */
        private final TextView f57456b;

        /* renamed from: c, reason: collision with root package name */
        private final ImageView f57457c;

        public g(View view) {
            super(view);
            if (P.f127086a < 26) {
                view.setFocusable(true);
            }
            this.f57455a = (TextView) view.findViewById(C14374x.f134434v);
            this.f57456b = (TextView) view.findViewById(C14374x.f134407O);
            this.f57457c = (ImageView) view.findViewById(C14374x.f134432t);
            view.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PlayerControlView.g gVar = this.f57546a;
                    PlayerControlView.this.i0(gVar.getBindingAdapterPosition());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h extends RecyclerView.h<g> {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f57459a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f57460b;

        /* renamed from: c, reason: collision with root package name */
        private final Drawable[] f57461c;

        public boolean a() {
            return i(1) || i(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i10) {
            return i10;
        }

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f57459a = strArr;
            this.f57460b = new String[strArr.length];
            this.f57461c = drawableArr;
        }

        private boolean i(int i10) {
            if (PlayerControlView.this.f57416j0 == null) {
                return false;
            }
            if (i10 == 0) {
                return PlayerControlView.this.f57416j0.v(13);
            }
            if (i10 != 1) {
                return true;
            }
            return PlayerControlView.this.f57416j0.v(30) && PlayerControlView.this.f57416j0.v(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public g onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return PlayerControlView.this.new g(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(C14376z.f134445e, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f57459a.length;
        }

        public void h(int i10, String str) {
            this.f57460b[i10] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(g gVar, int i10) {
            if (i(i10)) {
                gVar.itemView.setLayoutParams(new RecyclerView.q(-1, -2));
            } else {
                gVar.itemView.setLayoutParams(new RecyclerView.q(0, 0));
            }
            gVar.f57455a.setText(this.f57459a[i10]);
            if (this.f57460b[i10] == null) {
                gVar.f57456b.setVisibility(8);
            } else {
                gVar.f57456b.setText(this.f57460b[i10]);
            }
            if (this.f57461c[i10] == null) {
                gVar.f57457c.setVisibility(8);
            } else {
                gVar.f57457c.setImageDrawable(this.f57461c[i10]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class j extends l {
        private j() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.l
        public void j(String str) {
        }

        public void l(List<k> list) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (list.get(i10).a()) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (PlayerControlView.this.f57441w != null) {
                ImageView imageView = PlayerControlView.this.f57441w;
                PlayerControlView playerControlView = PlayerControlView.this;
                imageView.setImageDrawable(z10 ? playerControlView.f57400b0 : playerControlView.f57402c0);
                PlayerControlView.this.f57441w.setContentDescription(z10 ? PlayerControlView.this.f57404d0 : PlayerControlView.this.f57406e0);
            }
            this.f57469a = list;
        }

        public static /* synthetic */ void k(j jVar, View view) {
            if (PlayerControlView.this.f57416j0 == null || !PlayerControlView.this.f57416j0.v(29)) {
                return;
            }
            PlayerControlView.this.f57416j0.M(PlayerControlView.this.f57416j0.A().a().G(3).K(-3).M(null).O(0).F());
            PlayerControlView.this.f57417k.dismiss();
        }

        @Override // androidx.media3.ui.PlayerControlView.l
        public void h(i iVar) {
            boolean z10;
            iVar.f57463a.setText(C14347B.f134276x);
            int i10 = 0;
            while (true) {
                if (i10 >= this.f57469a.size()) {
                    z10 = true;
                    break;
                } else {
                    if (this.f57469a.get(i10).a()) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            iVar.f57464b.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.j.k(this.f57547a, view);
                }
            });
        }

        @Override // androidx.media3.ui.PlayerControlView.l, androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, int i10) {
            int i11;
            super.onBindViewHolder(iVar, i10);
            if (i10 > 0) {
                k kVar = this.f57469a.get(i10 - 1);
                View view = iVar.f57464b;
                if (kVar.a()) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                view.setVisibility(i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final J.a f57466a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57467b;

        /* renamed from: c, reason: collision with root package name */
        public final String f57468c;

        public boolean a() {
            return this.f57466a.g(this.f57467b);
        }

        public k(J j10, int i10, int i11, String str) {
            this.f57466a = j10.a().get(i10);
            this.f57467b = i11;
            this.f57468c = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class l extends RecyclerView.h<i> {

        /* renamed from: a, reason: collision with root package name */
        protected List<k> f57469a = new ArrayList();

        protected abstract void h(i iVar);

        protected abstract void j(String str);

        protected l() {
        }

        protected void c() {
            this.f57469a = Collections.EMPTY_LIST;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: f */
        public void onBindViewHolder(i iVar, int i10) {
            final a3.B b10 = PlayerControlView.this.f57416j0;
            if (b10 == null) {
                return;
            }
            if (i10 == 0) {
                h(iVar);
                return;
            }
            final k kVar = this.f57469a.get(i10 - 1);
            final G gA = kVar.f57466a.a();
            boolean z10 = b10.A().f43681D.get(gA) != null && kVar.a();
            iVar.f57463a.setText(kVar.f57468c);
            iVar.f57464b.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.l.a(this.f57548a, b10, gA, kVar, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (this.f57469a.isEmpty()) {
                return 0;
            }
            return this.f57469a.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(C14376z.f134446f, viewGroup, false));
        }

        public static /* synthetic */ void a(l lVar, a3.B b10, G g10, k kVar, View view) {
            lVar.getClass();
            if (!b10.v(29)) {
                return;
            }
            b10.M(b10.A().a().L(new H(g10, L.y(Integer.valueOf(kVar.f57467b)))).P(kVar.f57466a.c(), false).F());
            lVar.j(kVar.f57468c);
            PlayerControlView.this.f57417k.dismiss();
        }
    }

    @Deprecated
    public interface m {
        void B(int i10);
    }

    @SuppressLint({"InlinedApi"})
    private static boolean d0(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 - i11;
        int i19 = i17 - i15;
        if (!(i12 - i10 == i16 - i14 && i18 == i19) && this.f57417k.isShowing()) {
            A0();
            this.f57417k.update(view, (getWidth() - this.f57417k.getWidth()) - this.f57419l, (-this.f57417k.getHeight()) - this.f57419l, -1, -1);
        }
    }

    public void setProgressUpdateListener(f fVar) {
    }

    private static class i extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f57463a;

        /* renamed from: b, reason: collision with root package name */
        public final View f57464b;

        public i(View view) {
            super(view);
            if (P.f127086a < 26) {
                view.setFocusable(true);
            }
            this.f57463a = (TextView) view.findViewById(C14374x.f134410R);
            this.f57464b = view.findViewById(C14374x.f134420h);
        }
    }

    static {
        a3.w.a("media3.ui");
        f57373A0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) throws Throwable {
        int i11;
        final PlayerControlView playerControlView;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z16;
        int i26;
        int i27;
        boolean z17;
        Context context2;
        ImageView imageView;
        int i28;
        boolean z18;
        boolean z19;
        int i29;
        TextView textView;
        boolean z20;
        final PlayerControlView playerControlView2;
        int i30;
        boolean z21;
        int i31;
        boolean z22;
        super(context, attributeSet, i10);
        int i32 = C14376z.f134442b;
        int i33 = C14372v.f134379g;
        int i34 = C14372v.f134378f;
        int i35 = C14372v.f134377e;
        int i36 = C14372v.f134386n;
        int i37 = C14372v.f134380h;
        int i38 = C14372v.f134387o;
        int i39 = C14372v.f134376d;
        int i40 = C14372v.f134375c;
        int i41 = C14372v.f134382j;
        int i42 = C14372v.f134383k;
        int i43 = C14372v.f134381i;
        int i44 = C14372v.f134385m;
        int i45 = C14372v.f134384l;
        int i46 = C14372v.f134390r;
        int i47 = C14372v.f134389q;
        int i48 = C14372v.f134391s;
        this.f57426o0 = true;
        this.f57432r0 = 5000;
        this.f57436t0 = 0;
        this.f57434s0 = HttpResponseStatus.SUCCESS_OK;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C14349D.f134348y, i10, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134280A, i32);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134286G, i33);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134285F, i34);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134284E, i35);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134281B, i36);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134287H, i37);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134292M, i38);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134283D, i39);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134282C, i40);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134289J, i41);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134290K, i42);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134288I, i43);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134302W, i44);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134301V, i45);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134304Y, i46);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134303X, i47);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(C14349D.f134307a0, i48);
                playerControlView = this;
                try {
                    playerControlView.f57432r0 = typedArrayObtainStyledAttributes.getInt(C14349D.f134299T, playerControlView.f57432r0);
                    playerControlView.f57436t0 = X(typedArrayObtainStyledAttributes, playerControlView.f57436t0);
                    boolean z23 = typedArrayObtainStyledAttributes.getBoolean(C14349D.f134296Q, true);
                    boolean z24 = typedArrayObtainStyledAttributes.getBoolean(C14349D.f134293N, true);
                    boolean z25 = typedArrayObtainStyledAttributes.getBoolean(C14349D.f134295P, true);
                    boolean z26 = typedArrayObtainStyledAttributes.getBoolean(C14349D.f134294O, true);
                    boolean z27 = typedArrayObtainStyledAttributes.getBoolean(C14349D.f134297R, false);
                    boolean z28 = typedArrayObtainStyledAttributes.getBoolean(C14349D.f134298S, false);
                    boolean z29 = typedArrayObtainStyledAttributes.getBoolean(C14349D.f134300U, false);
                    playerControlView.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(C14349D.f134305Z, playerControlView.f57434s0));
                    boolean z30 = typedArrayObtainStyledAttributes.getBoolean(C14349D.f134349z, true);
                    typedArrayObtainStyledAttributes.recycle();
                    z15 = z30;
                    i16 = resourceId11;
                    i17 = resourceId12;
                    i18 = resourceId13;
                    i20 = resourceId14;
                    i14 = resourceId15;
                    i21 = resourceId16;
                    i19 = resourceId4;
                    i12 = resourceId17;
                    z10 = z23;
                    z12 = z27;
                    z13 = z28;
                    z14 = z29;
                    i11 = resourceId2;
                    i13 = resourceId;
                    i22 = resourceId5;
                    i23 = resourceId6;
                    i15 = resourceId7;
                    i24 = resourceId9;
                    i25 = resourceId10;
                    z11 = z24;
                    z16 = z26;
                    i26 = resourceId3;
                    i27 = resourceId8;
                    z17 = z25;
                } catch (Throwable th2) {
                    th = th2;
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            i11 = i33;
            playerControlView = this;
            i12 = i48;
            i13 = i32;
            i14 = i46;
            i15 = i38;
            i16 = i42;
            i17 = i43;
            i18 = i44;
            i19 = i35;
            i20 = i45;
            i21 = i47;
            z10 = true;
            z11 = true;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = true;
            i22 = i36;
            i23 = i37;
            i24 = i40;
            i25 = i41;
            z16 = true;
            i26 = i34;
            i27 = i39;
            z17 = true;
        }
        LayoutInflater.from(context).inflate(i13, playerControlView);
        playerControlView.setDescendantFocusability(262144);
        c cVar = new c();
        playerControlView.f57401c = cVar;
        playerControlView.f57403d = new CopyOnWriteArrayList<>();
        playerControlView.f57381H = new F.b();
        playerControlView.f57382I = new F.c();
        StringBuilder sb2 = new StringBuilder();
        playerControlView.f57379F = sb2;
        int i49 = i27;
        int i50 = i24;
        playerControlView.f57380G = new Formatter(sb2, Locale.getDefault());
        playerControlView.f57438u0 = new long[0];
        playerControlView.f57440v0 = new boolean[0];
        playerControlView.f57442w0 = new long[0];
        playerControlView.f57444x0 = new boolean[0];
        playerControlView.f57383J = new Runnable() { // from class: h4.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f134360a.w0();
            }
        };
        playerControlView.f57376C = (TextView) playerControlView.findViewById(C14374x.f134425m);
        playerControlView.f57377D = (TextView) playerControlView.findViewById(C14374x.f134397E);
        ImageView imageView2 = (ImageView) playerControlView.findViewById(C14374x.f134408P);
        playerControlView.f57441w = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(cVar);
        }
        ImageView imageView3 = (ImageView) playerControlView.findViewById(C14374x.f134431s);
        playerControlView.f57443x = imageView3;
        b0(imageView3, new View.OnClickListener() { // from class: h4.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134361a.g0(view);
            }
        });
        ImageView imageView4 = (ImageView) playerControlView.findViewById(C14374x.f134436x);
        playerControlView.f57445y = imageView4;
        b0(imageView4, new View.OnClickListener() { // from class: h4.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134361a.g0(view);
            }
        });
        View viewFindViewById = playerControlView.findViewById(C14374x.f134404L);
        playerControlView.f57447z = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar);
        }
        View viewFindViewById2 = playerControlView.findViewById(C14374x.f134396D);
        playerControlView.f57374A = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        View viewFindViewById3 = playerControlView.findViewById(C14374x.f134415c);
        playerControlView.f57375B = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        D d10 = (D) playerControlView.findViewById(C14374x.f134399G);
        View viewFindViewById4 = playerControlView.findViewById(C14374x.f134400H);
        if (d10 != null) {
            playerControlView.f57378E = d10;
            context2 = context;
            imageView = imageView2;
            i28 = i25;
            z18 = z11;
            z19 = z16;
            i29 = i50;
            textView = null;
            z20 = z10;
            playerControlView2 = playerControlView;
            i30 = i49;
            z21 = z17;
            i31 = i15;
        } else if (viewFindViewById4 != null) {
            imageView = imageView2;
            z19 = z16;
            i28 = i25;
            playerControlView2 = this;
            context2 = context;
            i29 = i50;
            z20 = z10;
            i30 = i49;
            z21 = z17;
            i31 = i15;
            z18 = z11;
            textView = null;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context2, null, 0, attributeSet2, C14348C.f134279a);
            defaultTimeBar.setId(C14374x.f134399G);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            playerControlView2.f57378E = defaultTimeBar;
        } else {
            context2 = context;
            imageView = imageView2;
            i28 = i25;
            z18 = z11;
            z19 = z16;
            i29 = i50;
            textView = null;
            z20 = z10;
            playerControlView2 = playerControlView;
            i30 = i49;
            z21 = z17;
            i31 = i15;
            playerControlView2.f57378E = null;
        }
        D d11 = playerControlView2.f57378E;
        if (d11 != null) {
            d11.a(cVar);
        }
        Resources resources = context2.getResources();
        playerControlView2.f57399b = resources;
        ImageView imageView5 = (ImageView) playerControlView2.findViewById(C14374x.f134395C);
        playerControlView2.f57425o = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(cVar);
        }
        ImageView imageView6 = (ImageView) playerControlView2.findViewById(C14374x.f134398F);
        playerControlView2.f57421m = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(P.W(context2, resources, i23));
            imageView6.setOnClickListener(cVar);
        }
        ImageView imageView7 = (ImageView) playerControlView2.findViewById(C14374x.f134437y);
        playerControlView2.f57423n = imageView7;
        if (imageView7 != null) {
            imageView7.setImageDrawable(P.W(context2, resources, i19));
            imageView7.setOnClickListener(cVar);
        }
        Typeface typefaceH = C6187h.h(context2, C14373w.f134392a);
        ImageView imageView8 = (ImageView) playerControlView2.findViewById(C14374x.f134402J);
        TextView textView2 = (TextView) playerControlView2.findViewById(C14374x.f134403K);
        if (imageView8 != null) {
            imageView8.setImageDrawable(P.W(context2, resources, i31));
            playerControlView2.f57429q = imageView8;
            playerControlView2.f57433s = textView;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceH);
            playerControlView2.f57433s = textView2;
            playerControlView2.f57429q = textView2;
        } else {
            playerControlView2.f57433s = textView;
            playerControlView2.f57429q = textView;
        }
        View view = playerControlView2.f57429q;
        if (view != null) {
            view.setOnClickListener(cVar);
        }
        ImageView imageView9 = (ImageView) playerControlView2.findViewById(C14374x.f134429q);
        TextView textView3 = (TextView) playerControlView2.findViewById(C14374x.f134430r);
        if (imageView9 != null) {
            imageView9.setImageDrawable(P.W(context2, resources, i22));
            playerControlView2.f57427p = imageView9;
            playerControlView2.f57431r = textView;
        } else if (textView3 != null) {
            textView3.setTypeface(typefaceH);
            playerControlView2.f57431r = textView3;
            playerControlView2.f57427p = textView3;
        } else {
            playerControlView2.f57431r = textView;
            playerControlView2.f57427p = textView;
        }
        View view2 = playerControlView2.f57427p;
        if (view2 != null) {
            view2.setOnClickListener(cVar);
        }
        ImageView imageView10 = (ImageView) playerControlView2.findViewById(C14374x.f134401I);
        playerControlView2.f57435t = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(cVar);
        }
        ImageView imageView11 = (ImageView) playerControlView2.findViewById(C14374x.f134405M);
        playerControlView2.f57437u = imageView11;
        if (imageView11 != null) {
            imageView11.setOnClickListener(cVar);
        }
        playerControlView2.f57394U = resources.getInteger(C14375y.f134440b) / 100.0f;
        playerControlView2.f57395V = resources.getInteger(C14375y.f134439a) / 100.0f;
        ImageView imageView12 = (ImageView) playerControlView2.findViewById(C14374x.f134412T);
        playerControlView2.f57439v = imageView12;
        if (imageView12 != null) {
            imageView12.setImageDrawable(P.W(context2, resources, i12));
            playerControlView2.o0(false, imageView12);
        }
        t tVar = new t(playerControlView2);
        playerControlView2.f57397a = tVar;
        tVar.T(z15);
        h hVar = playerControlView2.new h(new String[]{resources.getString(C14347B.f134260h), resources.getString(C14347B.f134277y)}, new Drawable[]{P.W(context2, resources, C14372v.f134388p), P.W(context2, resources, C14372v.f134374b)});
        playerControlView2.f57407f = hVar;
        playerControlView2.f57419l = resources.getDimensionPixelSize(C14371u.f134369a);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context2).inflate(C14376z.f134444d, (ViewGroup) null);
        playerControlView2.f57405e = recyclerView;
        recyclerView.setAdapter(hVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(playerControlView2.getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        playerControlView2.f57417k = popupWindow;
        if (P.f127086a < 23) {
            z22 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z22 = false;
        }
        popupWindow.setOnDismissListener(cVar);
        playerControlView2.f57448z0 = true;
        playerControlView2.f57415j = new C14355e(playerControlView2.getResources());
        playerControlView2.f57400b0 = P.W(context2, resources, i14);
        playerControlView2.f57402c0 = P.W(context2, resources, i21);
        playerControlView2.f57404d0 = resources.getString(C14347B.f134254b);
        playerControlView2.f57406e0 = resources.getString(C14347B.f134253a);
        playerControlView2.f57411h = new j();
        playerControlView2.f57413i = new b();
        playerControlView2.f57409g = playerControlView2.new e(resources.getStringArray(C14369s.f134367a), f57373A0);
        playerControlView2.f57384K = P.W(context2, resources, i11);
        playerControlView2.f57385L = P.W(context2, resources, i26);
        playerControlView2.f57408f0 = P.W(context2, resources, i30);
        playerControlView2.f57410g0 = P.W(context2, resources, i29);
        playerControlView2.f57386M = P.W(context2, resources, i28);
        playerControlView2.f57387N = P.W(context2, resources, i16);
        playerControlView2.f57388O = P.W(context2, resources, i17);
        playerControlView2.f57392S = P.W(context2, resources, i18);
        playerControlView2.f57393T = P.W(context2, resources, i20);
        playerControlView2.f57412h0 = resources.getString(C14347B.f134256d);
        playerControlView2.f57414i0 = resources.getString(C14347B.f134255c);
        playerControlView2.f57389P = resources.getString(C14347B.f134262j);
        playerControlView2.f57390Q = resources.getString(C14347B.f134263k);
        playerControlView2.f57391R = resources.getString(C14347B.f134261i);
        playerControlView2.f57396W = resources.getString(C14347B.f134266n);
        playerControlView2.f57398a0 = resources.getString(C14347B.f134265m);
        tVar.U((ViewGroup) playerControlView2.findViewById(C14374x.f134417e), true);
        tVar.U(playerControlView2.f57427p, z18);
        tVar.U(playerControlView2.f57429q, z20);
        tVar.U(imageView6, z21);
        tVar.U(imageView7, z19);
        tVar.U(imageView11, z12);
        tVar.U(imageView, z13);
        tVar.U(imageView12, z14);
        tVar.U(imageView10, playerControlView2.f57436t0 != 0 ? true : z22);
        playerControlView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: h4.h
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i51, int i52, int i53, int i54, int i55, int i56, int i57, int i58) {
                this.f134362a.h0(view3, i51, i52, i53, i54, i55, i56, i57, i58);
            }
        });
    }

    private void A0() {
        this.f57405e.measure(0, 0);
        this.f57417k.setWidth(Math.min(this.f57405e.getMeasuredWidth(), getWidth() - (this.f57419l * 2)));
        this.f57417k.setHeight(Math.min(getHeight() - (this.f57419l * 2), this.f57405e.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerControlView.C0():void");
    }

    private static boolean T(a3.B b10, F.c cVar) {
        F fY;
        int iP;
        if (!b10.v(17) || (iP = (fY = b10.y()).p()) <= 1 || iP > 100) {
            return false;
        }
        for (int i10 = 0; i10 < iP; i10++) {
            if (fY.n(i10, cVar).f43627m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(RecyclerView.h<?> hVar, View view) {
        this.f57405e.setAdapter(hVar);
        A0();
        this.f57448z0 = false;
        this.f57417k.dismiss();
        this.f57448z0 = true;
        this.f57417k.showAsDropDown(view, (getWidth() - this.f57417k.getWidth()) - this.f57419l, (-this.f57417k.getHeight()) - this.f57419l);
    }

    private L<k> W(J j10, int i10) {
        L.a aVar = new L.a();
        L<J.a> lA = j10.a();
        for (int i11 = 0; i11 < lA.size(); i11++) {
            J.a aVar2 = lA.get(i11);
            if (aVar2.c() == i10) {
                for (int i12 = 0; i12 < aVar2.f43757a; i12++) {
                    if (aVar2.h(i12)) {
                        a3.t tVarB = aVar2.b(i12);
                        if ((tVarB.f43939e & 2) == 0) {
                            aVar.a(new k(j10, i11, i12, this.f57415j.a(tVarB)));
                        }
                    }
                }
            }
        }
        return aVar.k();
    }

    private static int X(TypedArray typedArray, int i10) {
        return typedArray.getInt(C14349D.f134291L, i10);
    }

    private void a0() {
        this.f57411h.c();
        this.f57413i.c();
        a3.B b10 = this.f57416j0;
        if (b10 != null && b10.v(30) && this.f57416j0.v(29)) {
            J jR = this.f57416j0.r();
            this.f57413i.m(W(jR, 1));
            if (this.f57397a.A(this.f57441w)) {
                this.f57411h.l(W(jR, 3));
            } else {
                this.f57411h.l(L.x());
            }
        }
    }

    private static void b0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(View view) {
        s0(!this.f57420l0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(int i10) {
        if (i10 == 0) {
            V(this.f57409g, (View) C13466a.e(this.f57447z));
        } else if (i10 == 1) {
            V(this.f57413i, (View) C13466a.e(this.f57447z));
        } else {
            this.f57417k.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(a3.B b10, long j10) {
        if (this.f57428p0) {
            if (b10.v(17) && b10.v(10)) {
                F fY = b10.y();
                int iP = fY.p();
                int i10 = 0;
                while (true) {
                    long jD = fY.n(i10, this.f57382I).d();
                    if (j10 < jD) {
                        break;
                    }
                    if (i10 == iP - 1) {
                        j10 = jD;
                        break;
                    } else {
                        j10 -= jD;
                        i10++;
                    }
                }
                b10.D(i10, j10);
            }
        } else if (b10.v(5)) {
            b10.P(j10);
        }
        w0();
    }

    private void o0(boolean z10, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.f57394U : this.f57395V);
    }

    private void p0() {
        a3.B b10 = this.f57416j0;
        int iR = (int) ((b10 != null ? b10.R() : 15000L) / 1000);
        TextView textView = this.f57431r;
        if (textView != null) {
            textView.setText(String.valueOf(iR));
        }
        View view = this.f57427p;
        if (view != null) {
            view.setContentDescription(this.f57399b.getQuantityString(C14346A.f134246a, iR, Integer.valueOf(iR)));
        }
    }

    private void q0(ImageView imageView, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (z10) {
            imageView.setImageDrawable(this.f57408f0);
            imageView.setContentDescription(this.f57412h0);
        } else {
            imageView.setImageDrawable(this.f57410g0);
            imageView.setContentDescription(this.f57414i0);
        }
    }

    private static void r0(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        a3.B b10 = this.f57416j0;
        if (b10 == null || !b10.v(13)) {
            return;
        }
        a3.B b11 = this.f57416j0;
        b11.d(b11.f().b(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        a3.B b10 = this.f57416j0;
        if (b10 == null) {
            return;
        }
        this.f57409g.i(b10.f().f43552a);
        this.f57407f.h(0, this.f57409g.c());
        z0();
    }

    private void y0() {
        a3.B b10 = this.f57416j0;
        int iH0 = (int) ((b10 != null ? b10.h0() : 5000L) / 1000);
        TextView textView = this.f57433s;
        if (textView != null) {
            textView.setText(String.valueOf(iH0));
        }
        View view = this.f57429q;
        if (view != null) {
            view.setContentDescription(this.f57399b.getQuantityString(C14346A.f134247b, iH0, Integer.valueOf(iH0)));
        }
    }

    private void z0() {
        o0(this.f57407f.a(), this.f57447z);
    }

    public void Y() {
        this.f57397a.C();
    }

    public void Z() {
        this.f57397a.F();
    }

    public boolean c0() {
        return this.f57397a.I();
    }

    void f0() {
        Iterator<m> it = this.f57403d.iterator();
        while (it.hasNext()) {
            it.next().B(getVisibility());
        }
    }

    public a3.B getPlayer() {
        return this.f57416j0;
    }

    public int getRepeatToggleModes() {
        return this.f57436t0;
    }

    public boolean getShowShuffleButton() {
        return this.f57397a.A(this.f57437u);
    }

    public boolean getShowSubtitleButton() {
        return this.f57397a.A(this.f57441w);
    }

    public int getShowTimeoutMs() {
        return this.f57432r0;
    }

    public boolean getShowVrButton() {
        return this.f57397a.A(this.f57439v);
    }

    @Deprecated
    public void j0(m mVar) {
        this.f57403d.remove(mVar);
    }

    void k0() {
        ImageView imageView = this.f57425o;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void m0() {
        this.f57397a.X();
    }

    public void s0(boolean z10) {
        if (this.f57420l0 == z10) {
            return;
        }
        this.f57420l0 = z10;
        q0(this.f57443x, z10);
        q0(this.f57445y, z10);
        d dVar = this.f57418k0;
        if (dVar != null) {
            dVar.E(z10);
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.f57397a.T(z10);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(d dVar) {
        this.f57418k0 = dVar;
        r0(this.f57443x, dVar != null);
        r0(this.f57445y, dVar != null);
    }

    public void setRepeatToggleModes(int i10) {
        this.f57436t0 = i10;
        a3.B b10 = this.f57416j0;
        if (b10 != null && b10.v(15)) {
            int iA0 = this.f57416j0.a0();
            if (i10 == 0 && iA0 != 0) {
                this.f57416j0.X(0);
            } else if (i10 == 1 && iA0 == 2) {
                this.f57416j0.X(1);
            } else if (i10 == 2 && iA0 == 1) {
                this.f57416j0.X(2);
            }
        }
        this.f57397a.U(this.f57435t, i10 != 0);
        x0();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f57397a.U(this.f57427p, z10);
        t0();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f57424n0 = z10;
        C0();
    }

    public void setShowNextButton(boolean z10) {
        this.f57397a.U(this.f57423n, z10);
        t0();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.f57426o0 = z10;
        u0();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f57397a.U(this.f57421m, z10);
        t0();
    }

    public void setShowRewindButton(boolean z10) {
        this.f57397a.U(this.f57429q, z10);
        t0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f57397a.U(this.f57437u, z10);
        B0();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f57397a.U(this.f57441w, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f57432r0 = i10;
        if (c0()) {
            this.f57397a.S();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f57397a.U(this.f57439v, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f57434s0 = P.o(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f57439v;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            o0(onClickListener != null, this.f57439v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (e0() && this.f57422m0 && (imageView = this.f57437u) != null) {
            a3.B b10 = this.f57416j0;
            if (!this.f57397a.A(imageView)) {
                o0(false, this.f57437u);
                return;
            }
            if (b10 != null && b10.v(14)) {
                o0(true, this.f57437u);
                ImageView imageView2 = this.f57437u;
                if (b10.b0()) {
                    drawable = this.f57392S;
                } else {
                    drawable = this.f57393T;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.f57437u;
                if (b10.b0()) {
                    str = this.f57396W;
                } else {
                    str = this.f57398a0;
                }
                imageView3.setContentDescription(str);
                return;
            }
            o0(false, this.f57437u);
            this.f57437u.setImageDrawable(this.f57393T);
            this.f57437u.setContentDescription(this.f57398a0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        boolean z10;
        a0();
        if (this.f57411h.getItemCount() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        o0(z10, this.f57441w);
        z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        boolean zV;
        boolean zV2;
        boolean zV3;
        boolean zV4;
        boolean zV5;
        if (e0() && this.f57422m0) {
            a3.B b10 = this.f57416j0;
            if (b10 != null) {
                if (this.f57424n0 && T(b10, this.f57382I)) {
                    zV = b10.v(10);
                } else {
                    zV = b10.v(5);
                }
                zV3 = b10.v(7);
                zV4 = b10.v(11);
                zV5 = b10.v(12);
                zV2 = b10.v(9);
            } else {
                zV = false;
                zV2 = false;
                zV3 = false;
                zV4 = false;
                zV5 = false;
            }
            if (zV4) {
                y0();
            }
            if (zV5) {
                p0();
            }
            o0(zV3, this.f57421m);
            o0(zV4, this.f57429q);
            o0(zV5, this.f57427p);
            o0(zV2, this.f57423n);
            D d10 = this.f57378E;
            if (d10 != null) {
                d10.setEnabled(zV);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        Drawable drawable;
        int i10;
        if (e0() && this.f57422m0 && this.f57425o != null) {
            boolean zB1 = P.b1(this.f57416j0, this.f57426o0);
            if (zB1) {
                drawable = this.f57384K;
            } else {
                drawable = this.f57385L;
            }
            if (zB1) {
                i10 = C14347B.f134259g;
            } else {
                i10 = C14347B.f134258f;
            }
            this.f57425o.setImageDrawable(drawable);
            this.f57425o.setContentDescription(this.f57399b.getString(i10));
            o0(P.a1(this.f57416j0), this.f57425o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        long jS;
        long jC0;
        int iU;
        long preferredUpdateDelay;
        if (e0() && this.f57422m0) {
            a3.B b10 = this.f57416j0;
            if (b10 != null && b10.v(16)) {
                jS = this.f57446y0 + b10.S();
                jC0 = this.f57446y0 + b10.c0();
            } else {
                jS = 0;
                jC0 = 0;
            }
            TextView textView = this.f57377D;
            if (textView != null && !this.f57430q0) {
                textView.setText(P.k0(this.f57379F, this.f57380G, jS));
            }
            D d10 = this.f57378E;
            if (d10 != null) {
                d10.setPosition(jS);
                this.f57378E.setBufferedPosition(jC0);
            }
            removeCallbacks(this.f57383J);
            if (b10 == null) {
                iU = 1;
            } else {
                iU = b10.U();
            }
            long j10 = 1000;
            if (b10 != null && b10.V()) {
                D d11 = this.f57378E;
                if (d11 != null) {
                    preferredUpdateDelay = d11.getPreferredUpdateDelay();
                } else {
                    preferredUpdateDelay = 1000;
                }
                long jMin = Math.min(preferredUpdateDelay, 1000 - (jS % 1000));
                float f10 = b10.f().f43552a;
                if (f10 > 0.0f) {
                    j10 = (long) (jMin / f10);
                }
                postDelayed(this.f57383J, P.p(j10, this.f57434s0, 1000L));
                return;
            }
            if (iU != 4 && iU != 1) {
                postDelayed(this.f57383J, 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0() {
        ImageView imageView;
        if (e0() && this.f57422m0 && (imageView = this.f57435t) != null) {
            if (this.f57436t0 == 0) {
                o0(false, imageView);
                return;
            }
            a3.B b10 = this.f57416j0;
            if (b10 != null && b10.v(15)) {
                o0(true, this.f57435t);
                int iA0 = b10.a0();
                if (iA0 != 0) {
                    if (iA0 != 1) {
                        if (iA0 == 2) {
                            this.f57435t.setImageDrawable(this.f57388O);
                            this.f57435t.setContentDescription(this.f57391R);
                            return;
                        }
                        return;
                    }
                    this.f57435t.setImageDrawable(this.f57387N);
                    this.f57435t.setContentDescription(this.f57390Q);
                    return;
                }
                this.f57435t.setImageDrawable(this.f57386M);
                this.f57435t.setContentDescription(this.f57389P);
                return;
            }
            o0(false, this.f57435t);
            this.f57435t.setImageDrawable(this.f57386M);
            this.f57435t.setContentDescription(this.f57389P);
        }
    }

    @Deprecated
    public void S(m mVar) {
        C13466a.e(mVar);
        this.f57403d.add(mVar);
    }

    public boolean U(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a3.B b10 = this.f57416j0;
        if (b10 != null && d0(keyCode)) {
            if (keyEvent.getAction() == 0) {
                if (keyCode == 90) {
                    if (b10.U() != 4 && b10.v(12)) {
                        b10.d0();
                        return true;
                    }
                    return true;
                }
                if (keyCode == 89 && b10.v(11)) {
                    b10.e0();
                    return true;
                }
                if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 && keyCode != 85) {
                        if (keyCode != 87) {
                            if (keyCode != 88) {
                                if (keyCode != 126) {
                                    if (keyCode == 127) {
                                        P.r0(b10);
                                        return true;
                                    }
                                    return true;
                                }
                                P.s0(b10);
                                return true;
                            }
                            if (b10.v(7)) {
                                b10.p();
                                return true;
                            }
                            return true;
                        }
                        if (b10.v(9)) {
                            b10.B();
                            return true;
                        }
                        return true;
                    }
                    P.t0(b10, this.f57426o0);
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!U(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public boolean e0() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    void n0() {
        u0();
        t0();
        x0();
        B0();
        D0();
        v0();
        C0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57397a.K();
        this.f57422m0 = true;
        if (c0()) {
            this.f57397a.S();
        }
        n0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57397a.L();
        this.f57422m0 = false;
        removeCallbacks(this.f57383J);
        this.f57397a.R();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f57397a.M(z10, i10, i11, i12, i13);
    }

    public void setPlayer(a3.B b10) {
        boolean z10;
        boolean z11 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.g(z10);
        if (b10 == null || b10.z() == Looper.getMainLooper()) {
            z11 = true;
        }
        C13466a.a(z11);
        a3.B b11 = this.f57416j0;
        if (b11 == b10) {
            return;
        }
        if (b11 != null) {
            b11.Z(this.f57401c);
        }
        this.f57416j0 = b10;
        if (b10 != null) {
            b10.l(this.f57401c);
        }
        n0();
    }
}
