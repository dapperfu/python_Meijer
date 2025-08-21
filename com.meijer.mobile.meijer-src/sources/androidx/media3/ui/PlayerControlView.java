package androidx.media3.ui;

import Ee.L;
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
import b2.C6327h;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d3.C13599a;
import d3.P;
import h4.C14459A;
import h4.C14460B;
import h4.C14461C;
import h4.C14466e;
import h4.E;
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
    private static final float[] f57597A0;

    /* renamed from: A, reason: collision with root package name */
    private final View f57598A;

    /* renamed from: B, reason: collision with root package name */
    private final View f57599B;

    /* renamed from: C, reason: collision with root package name */
    private final TextView f57600C;

    /* renamed from: D, reason: collision with root package name */
    private final TextView f57601D;

    /* renamed from: E, reason: collision with root package name */
    private final D f57602E;

    /* renamed from: F, reason: collision with root package name */
    private final StringBuilder f57603F;

    /* renamed from: G, reason: collision with root package name */
    private final Formatter f57604G;

    /* renamed from: H, reason: collision with root package name */
    private final F.b f57605H;

    /* renamed from: I, reason: collision with root package name */
    private final F.c f57606I;

    /* renamed from: J, reason: collision with root package name */
    private final Runnable f57607J;

    /* renamed from: K, reason: collision with root package name */
    private final Drawable f57608K;

    /* renamed from: L, reason: collision with root package name */
    private final Drawable f57609L;

    /* renamed from: M, reason: collision with root package name */
    private final Drawable f57610M;

    /* renamed from: N, reason: collision with root package name */
    private final Drawable f57611N;

    /* renamed from: O, reason: collision with root package name */
    private final Drawable f57612O;

    /* renamed from: P, reason: collision with root package name */
    private final String f57613P;

    /* renamed from: Q, reason: collision with root package name */
    private final String f57614Q;

    /* renamed from: R, reason: collision with root package name */
    private final String f57615R;

    /* renamed from: S, reason: collision with root package name */
    private final Drawable f57616S;

    /* renamed from: T, reason: collision with root package name */
    private final Drawable f57617T;

    /* renamed from: U, reason: collision with root package name */
    private final float f57618U;

    /* renamed from: V, reason: collision with root package name */
    private final float f57619V;

    /* renamed from: W, reason: collision with root package name */
    private final String f57620W;

    /* renamed from: a, reason: collision with root package name */
    private final t f57621a;

    /* renamed from: a0, reason: collision with root package name */
    private final String f57622a0;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f57623b;

    /* renamed from: b0, reason: collision with root package name */
    private final Drawable f57624b0;

    /* renamed from: c, reason: collision with root package name */
    private final c f57625c;

    /* renamed from: c0, reason: collision with root package name */
    private final Drawable f57626c0;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList<m> f57627d;

    /* renamed from: d0, reason: collision with root package name */
    private final String f57628d0;

    /* renamed from: e, reason: collision with root package name */
    private final RecyclerView f57629e;

    /* renamed from: e0, reason: collision with root package name */
    private final String f57630e0;

    /* renamed from: f, reason: collision with root package name */
    private final h f57631f;

    /* renamed from: f0, reason: collision with root package name */
    private final Drawable f57632f0;

    /* renamed from: g, reason: collision with root package name */
    private final e f57633g;

    /* renamed from: g0, reason: collision with root package name */
    private final Drawable f57634g0;

    /* renamed from: h, reason: collision with root package name */
    private final j f57635h;

    /* renamed from: h0, reason: collision with root package name */
    private final String f57636h0;

    /* renamed from: i, reason: collision with root package name */
    private final b f57637i;

    /* renamed from: i0, reason: collision with root package name */
    private final String f57638i0;

    /* renamed from: j, reason: collision with root package name */
    private final E f57639j;

    /* renamed from: j0, reason: collision with root package name */
    private a3.B f57640j0;

    /* renamed from: k, reason: collision with root package name */
    private final PopupWindow f57641k;

    /* renamed from: k0, reason: collision with root package name */
    private d f57642k0;

    /* renamed from: l, reason: collision with root package name */
    private final int f57643l;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f57644l0;

    /* renamed from: m, reason: collision with root package name */
    private final ImageView f57645m;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f57646m0;

    /* renamed from: n, reason: collision with root package name */
    private final ImageView f57647n;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f57648n0;

    /* renamed from: o, reason: collision with root package name */
    private final ImageView f57649o;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f57650o0;

    /* renamed from: p, reason: collision with root package name */
    private final View f57651p;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f57652p0;

    /* renamed from: q, reason: collision with root package name */
    private final View f57653q;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f57654q0;

    /* renamed from: r, reason: collision with root package name */
    private final TextView f57655r;

    /* renamed from: r0, reason: collision with root package name */
    private int f57656r0;

    /* renamed from: s, reason: collision with root package name */
    private final TextView f57657s;

    /* renamed from: s0, reason: collision with root package name */
    private int f57658s0;

    /* renamed from: t, reason: collision with root package name */
    private final ImageView f57659t;

    /* renamed from: t0, reason: collision with root package name */
    private int f57660t0;

    /* renamed from: u, reason: collision with root package name */
    private final ImageView f57661u;

    /* renamed from: u0, reason: collision with root package name */
    private long[] f57662u0;

    /* renamed from: v, reason: collision with root package name */
    private final ImageView f57663v;

    /* renamed from: v0, reason: collision with root package name */
    private boolean[] f57664v0;

    /* renamed from: w, reason: collision with root package name */
    private final ImageView f57665w;

    /* renamed from: w0, reason: collision with root package name */
    private long[] f57666w0;

    /* renamed from: x, reason: collision with root package name */
    private final ImageView f57667x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean[] f57668x0;

    /* renamed from: y, reason: collision with root package name */
    private final ImageView f57669y;

    /* renamed from: y0, reason: collision with root package name */
    private long f57670y0;

    /* renamed from: z, reason: collision with root package name */
    private final View f57671z;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f57672z0;

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends l {
        private b() {
            super();
        }

        private boolean l(I i10) {
            for (int i11 = 0; i11 < this.f57693a.size(); i11++) {
                if (i10.f44499D.containsKey(this.f57693a.get(i11).f57690a.a())) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void k(b bVar, View view) {
            if (PlayerControlView.this.f57640j0 == null || !PlayerControlView.this.f57640j0.v(29)) {
                return;
            }
            ((a3.B) P.h(PlayerControlView.this.f57640j0)).M(PlayerControlView.this.f57640j0.A().a().G(1).P(1, false).F());
            PlayerControlView.this.f57631f.h(1, PlayerControlView.this.getResources().getString(C14460B.f134746w));
            PlayerControlView.this.f57641k.dismiss();
        }

        @Override // androidx.media3.ui.PlayerControlView.l
        public void h(i iVar) {
            iVar.f57687a.setText(C14460B.f134746w);
            iVar.f57688b.setVisibility(l(((a3.B) C13599a.e(PlayerControlView.this.f57640j0)).A()) ? 4 : 0);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.b.k(this.f57767a, view);
                }
            });
        }

        @Override // androidx.media3.ui.PlayerControlView.l
        public void j(String str) {
            PlayerControlView.this.f57631f.h(1, str);
        }

        public void m(List<k> list) {
            this.f57693a = list;
            I iA = ((a3.B) C13599a.e(PlayerControlView.this.f57640j0)).A();
            if (list.isEmpty()) {
                PlayerControlView.this.f57631f.h(1, PlayerControlView.this.getResources().getString(C14460B.f134747x));
                return;
            }
            if (!l(iA)) {
                PlayerControlView.this.f57631f.h(1, PlayerControlView.this.getResources().getString(C14460B.f134746w));
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                k kVar = list.get(i10);
                if (kVar.a()) {
                    PlayerControlView.this.f57631f.h(1, kVar.f57692c);
                    return;
                }
            }
        }
    }

    private final class c implements B.d, D.a, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
        }

        @Override // a3.B.d
        public void P0(a3.B b10, B.c cVar) {
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
            PlayerControlView.this.f57654q0 = true;
            if (PlayerControlView.this.f57601D != null) {
                PlayerControlView.this.f57601D.setText(P.k0(PlayerControlView.this.f57603F, PlayerControlView.this.f57604G, j10));
            }
            PlayerControlView.this.f57621a.R();
        }

        @Override // androidx.media3.ui.D.a
        public void E(D d10, long j10) {
            if (PlayerControlView.this.f57601D != null) {
                PlayerControlView.this.f57601D.setText(P.k0(PlayerControlView.this.f57603F, PlayerControlView.this.f57604G, j10));
            }
        }

        @Override // androidx.media3.ui.D.a
        public void G(D d10, long j10, boolean z10) {
            PlayerControlView.this.f57654q0 = false;
            if (!z10 && PlayerControlView.this.f57640j0 != null) {
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.l0(playerControlView.f57640j0, j10);
            }
            PlayerControlView.this.f57621a.S();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a3.B b10 = PlayerControlView.this.f57640j0;
            if (b10 == null) {
                return;
            }
            PlayerControlView.this.f57621a.S();
            if (PlayerControlView.this.f57647n == view) {
                if (b10.v(9)) {
                    b10.B();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f57645m == view) {
                if (b10.v(7)) {
                    b10.p();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f57651p == view) {
                if (b10.U() == 4 || !b10.v(12)) {
                    return;
                }
                b10.d0();
                return;
            }
            if (PlayerControlView.this.f57653q == view) {
                if (b10.v(11)) {
                    b10.e0();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f57649o == view) {
                P.t0(b10, PlayerControlView.this.f57650o0);
                return;
            }
            if (PlayerControlView.this.f57659t == view) {
                if (b10.v(15)) {
                    b10.X(d3.E.a(b10.a0(), PlayerControlView.this.f57660t0));
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f57661u == view) {
                if (b10.v(14)) {
                    b10.G(!b10.b0());
                    return;
                }
                return;
            }
            if (PlayerControlView.this.f57671z == view) {
                PlayerControlView.this.f57621a.R();
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.V(playerControlView.f57631f, PlayerControlView.this.f57671z);
                return;
            }
            if (PlayerControlView.this.f57598A == view) {
                PlayerControlView.this.f57621a.R();
                PlayerControlView playerControlView2 = PlayerControlView.this;
                playerControlView2.V(playerControlView2.f57633g, PlayerControlView.this.f57598A);
            } else if (PlayerControlView.this.f57599B == view) {
                PlayerControlView.this.f57621a.R();
                PlayerControlView playerControlView3 = PlayerControlView.this;
                playerControlView3.V(playerControlView3.f57637i, PlayerControlView.this.f57599B);
            } else if (PlayerControlView.this.f57665w == view) {
                PlayerControlView.this.f57621a.R();
                PlayerControlView playerControlView4 = PlayerControlView.this;
                playerControlView4.V(playerControlView4.f57635h, PlayerControlView.this.f57665w);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (PlayerControlView.this.f57672z0) {
                PlayerControlView.this.f57621a.S();
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
        private final String[] f57675a;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f57676b;

        /* renamed from: c, reason: collision with root package name */
        private int f57677c;

        public void i(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.f57676b;
                if (i10 >= fArr.length) {
                    this.f57677c = i11;
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
            this.f57675a = strArr;
            this.f57676b = fArr;
        }

        public static /* synthetic */ void a(e eVar, int i10, View view) {
            if (i10 != eVar.f57677c) {
                PlayerControlView.this.setPlaybackSpeed(eVar.f57676b[i10]);
            }
            PlayerControlView.this.f57641k.dismiss();
        }

        public String c() {
            return this.f57675a[this.f57677c];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, final int i10) {
            String[] strArr = this.f57675a;
            if (i10 < strArr.length) {
                iVar.f57687a.setText(strArr[i10]);
            }
            if (i10 == this.f57677c) {
                iVar.itemView.setSelected(true);
                iVar.f57688b.setVisibility(0);
            } else {
                iVar.itemView.setSelected(false);
                iVar.f57688b.setVisibility(4);
            }
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.e.a(this.f57768a, i10, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f57675a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(h4.z.f134917f, viewGroup, false));
        }
    }

    public interface f {
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class g extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f57679a;

        /* renamed from: b, reason: collision with root package name */
        private final TextView f57680b;

        /* renamed from: c, reason: collision with root package name */
        private final ImageView f57681c;

        public g(View view) {
            super(view);
            if (P.f127888a < 26) {
                view.setFocusable(true);
            }
            this.f57679a = (TextView) view.findViewById(h4.x.f134905v);
            this.f57680b = (TextView) view.findViewById(h4.x.f134878O);
            this.f57681c = (ImageView) view.findViewById(h4.x.f134903t);
            view.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PlayerControlView.g gVar = this.f57770a;
                    PlayerControlView.this.i0(gVar.getBindingAdapterPosition());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h extends RecyclerView.h<g> {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f57683a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f57684b;

        /* renamed from: c, reason: collision with root package name */
        private final Drawable[] f57685c;

        public boolean a() {
            return i(1) || i(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i10) {
            return i10;
        }

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f57683a = strArr;
            this.f57684b = new String[strArr.length];
            this.f57685c = drawableArr;
        }

        private boolean i(int i10) {
            if (PlayerControlView.this.f57640j0 == null) {
                return false;
            }
            if (i10 == 0) {
                return PlayerControlView.this.f57640j0.v(13);
            }
            if (i10 != 1) {
                return true;
            }
            return PlayerControlView.this.f57640j0.v(30) && PlayerControlView.this.f57640j0.v(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public g onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return PlayerControlView.this.new g(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(h4.z.f134916e, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f57683a.length;
        }

        public void h(int i10, String str) {
            this.f57684b[i10] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(g gVar, int i10) {
            if (i(i10)) {
                gVar.itemView.setLayoutParams(new RecyclerView.q(-1, -2));
            } else {
                gVar.itemView.setLayoutParams(new RecyclerView.q(0, 0));
            }
            gVar.f57679a.setText(this.f57683a[i10]);
            if (this.f57684b[i10] == null) {
                gVar.f57680b.setVisibility(8);
            } else {
                gVar.f57680b.setText(this.f57684b[i10]);
            }
            if (this.f57685c[i10] == null) {
                gVar.f57681c.setVisibility(8);
            } else {
                gVar.f57681c.setImageDrawable(this.f57685c[i10]);
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
            if (PlayerControlView.this.f57665w != null) {
                ImageView imageView = PlayerControlView.this.f57665w;
                PlayerControlView playerControlView = PlayerControlView.this;
                imageView.setImageDrawable(z10 ? playerControlView.f57624b0 : playerControlView.f57626c0);
                PlayerControlView.this.f57665w.setContentDescription(z10 ? PlayerControlView.this.f57628d0 : PlayerControlView.this.f57630e0);
            }
            this.f57693a = list;
        }

        public static /* synthetic */ void k(j jVar, View view) {
            if (PlayerControlView.this.f57640j0 == null || !PlayerControlView.this.f57640j0.v(29)) {
                return;
            }
            PlayerControlView.this.f57640j0.M(PlayerControlView.this.f57640j0.A().a().G(3).K(-3).M(null).O(0).F());
            PlayerControlView.this.f57641k.dismiss();
        }

        @Override // androidx.media3.ui.PlayerControlView.l
        public void h(i iVar) {
            boolean z10;
            iVar.f57687a.setText(C14460B.f134747x);
            int i10 = 0;
            while (true) {
                if (i10 >= this.f57693a.size()) {
                    z10 = true;
                    break;
                } else {
                    if (this.f57693a.get(i10).a()) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            iVar.f57688b.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.j.k(this.f57771a, view);
                }
            });
        }

        @Override // androidx.media3.ui.PlayerControlView.l, androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, int i10) {
            int i11;
            super.onBindViewHolder(iVar, i10);
            if (i10 > 0) {
                k kVar = this.f57693a.get(i10 - 1);
                View view = iVar.f57688b;
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
        public final J.a f57690a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57691b;

        /* renamed from: c, reason: collision with root package name */
        public final String f57692c;

        public boolean a() {
            return this.f57690a.g(this.f57691b);
        }

        public k(J j10, int i10, int i11, String str) {
            this.f57690a = j10.a().get(i10);
            this.f57691b = i11;
            this.f57692c = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class l extends RecyclerView.h<i> {

        /* renamed from: a, reason: collision with root package name */
        protected List<k> f57693a = new ArrayList();

        protected abstract void h(i iVar);

        protected abstract void j(String str);

        protected l() {
        }

        protected void c() {
            this.f57693a = Collections.EMPTY_LIST;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: g */
        public void onBindViewHolder(i iVar, int i10) {
            final a3.B b10 = PlayerControlView.this.f57640j0;
            if (b10 == null) {
                return;
            }
            if (i10 == 0) {
                h(iVar);
                return;
            }
            final k kVar = this.f57693a.get(i10 - 1);
            final G gA = kVar.f57690a.a();
            boolean z10 = b10.A().f44499D.get(gA) != null && kVar.a();
            iVar.f57687a.setText(kVar.f57692c);
            iVar.f57688b.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.l.a(this.f57772a, b10, gA, kVar, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (this.f57693a.isEmpty()) {
                return 0;
            }
            return this.f57693a.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(h4.z.f134917f, viewGroup, false));
        }

        public static /* synthetic */ void a(l lVar, a3.B b10, G g10, k kVar, View view) {
            lVar.getClass();
            if (!b10.v(29)) {
                return;
            }
            b10.M(b10.A().a().L(new H(g10, L.y(Integer.valueOf(kVar.f57691b)))).P(kVar.f57690a.c(), false).F());
            lVar.j(kVar.f57692c);
            PlayerControlView.this.f57641k.dismiss();
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
        if (!(i12 - i10 == i16 - i14 && i18 == i19) && this.f57641k.isShowing()) {
            A0();
            this.f57641k.update(view, (getWidth() - this.f57641k.getWidth()) - this.f57643l, (-this.f57641k.getHeight()) - this.f57643l, -1, -1);
        }
    }

    public void setProgressUpdateListener(f fVar) {
    }

    private static class i extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f57687a;

        /* renamed from: b, reason: collision with root package name */
        public final View f57688b;

        public i(View view) {
            super(view);
            if (P.f127888a < 26) {
                view.setFocusable(true);
            }
            this.f57687a = (TextView) view.findViewById(h4.x.f134881R);
            this.f57688b = view.findViewById(h4.x.f134891h);
        }
    }

    static {
        a3.w.a("media3.ui");
        f57597A0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
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
        int i32 = h4.z.f134913b;
        int i33 = h4.v.f134850g;
        int i34 = h4.v.f134849f;
        int i35 = h4.v.f134848e;
        int i36 = h4.v.f134857n;
        int i37 = h4.v.f134851h;
        int i38 = h4.v.f134858o;
        int i39 = h4.v.f134847d;
        int i40 = h4.v.f134846c;
        int i41 = h4.v.f134853j;
        int i42 = h4.v.f134854k;
        int i43 = h4.v.f134852i;
        int i44 = h4.v.f134856m;
        int i45 = h4.v.f134855l;
        int i46 = h4.v.f134861r;
        int i47 = h4.v.f134860q;
        int i48 = h4.v.f134862s;
        this.f57650o0 = true;
        this.f57656r0 = 5000;
        this.f57660t0 = 0;
        this.f57658s0 = HttpResponseStatus.SUCCESS_OK;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, h4.D.f134819y, i10, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134751A, i32);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134757G, i33);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134756F, i34);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134755E, i35);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134752B, i36);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134758H, i37);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134763M, i38);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134754D, i39);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134753C, i40);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134760J, i41);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134761K, i42);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134759I, i43);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134773W, i44);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134772V, i45);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134775Y, i46);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134774X, i47);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(h4.D.f134778a0, i48);
                playerControlView = this;
                try {
                    playerControlView.f57656r0 = typedArrayObtainStyledAttributes.getInt(h4.D.f134770T, playerControlView.f57656r0);
                    playerControlView.f57660t0 = X(typedArrayObtainStyledAttributes, playerControlView.f57660t0);
                    boolean z23 = typedArrayObtainStyledAttributes.getBoolean(h4.D.f134767Q, true);
                    boolean z24 = typedArrayObtainStyledAttributes.getBoolean(h4.D.f134764N, true);
                    boolean z25 = typedArrayObtainStyledAttributes.getBoolean(h4.D.f134766P, true);
                    boolean z26 = typedArrayObtainStyledAttributes.getBoolean(h4.D.f134765O, true);
                    boolean z27 = typedArrayObtainStyledAttributes.getBoolean(h4.D.f134768R, false);
                    boolean z28 = typedArrayObtainStyledAttributes.getBoolean(h4.D.f134769S, false);
                    boolean z29 = typedArrayObtainStyledAttributes.getBoolean(h4.D.f134771U, false);
                    playerControlView.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(h4.D.f134776Z, playerControlView.f57658s0));
                    boolean z30 = typedArrayObtainStyledAttributes.getBoolean(h4.D.f134820z, true);
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
        playerControlView.f57625c = cVar;
        playerControlView.f57627d = new CopyOnWriteArrayList<>();
        playerControlView.f57605H = new F.b();
        playerControlView.f57606I = new F.c();
        StringBuilder sb2 = new StringBuilder();
        playerControlView.f57603F = sb2;
        int i49 = i27;
        int i50 = i24;
        playerControlView.f57604G = new Formatter(sb2, Locale.getDefault());
        playerControlView.f57662u0 = new long[0];
        playerControlView.f57664v0 = new boolean[0];
        playerControlView.f57666w0 = new long[0];
        playerControlView.f57668x0 = new boolean[0];
        playerControlView.f57607J = new Runnable() { // from class: h4.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f134831a.w0();
            }
        };
        playerControlView.f57600C = (TextView) playerControlView.findViewById(h4.x.f134896m);
        playerControlView.f57601D = (TextView) playerControlView.findViewById(h4.x.f134868E);
        ImageView imageView2 = (ImageView) playerControlView.findViewById(h4.x.f134879P);
        playerControlView.f57665w = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(cVar);
        }
        ImageView imageView3 = (ImageView) playerControlView.findViewById(h4.x.f134902s);
        playerControlView.f57667x = imageView3;
        b0(imageView3, new View.OnClickListener() { // from class: h4.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134832a.g0(view);
            }
        });
        ImageView imageView4 = (ImageView) playerControlView.findViewById(h4.x.f134907x);
        playerControlView.f57669y = imageView4;
        b0(imageView4, new View.OnClickListener() { // from class: h4.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134832a.g0(view);
            }
        });
        View viewFindViewById = playerControlView.findViewById(h4.x.f134875L);
        playerControlView.f57671z = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar);
        }
        View viewFindViewById2 = playerControlView.findViewById(h4.x.f134867D);
        playerControlView.f57598A = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        View viewFindViewById3 = playerControlView.findViewById(h4.x.f134886c);
        playerControlView.f57599B = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        D d10 = (D) playerControlView.findViewById(h4.x.f134870G);
        View viewFindViewById4 = playerControlView.findViewById(h4.x.f134871H);
        if (d10 != null) {
            playerControlView.f57602E = d10;
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
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context2, null, 0, attributeSet2, C14461C.f134750a);
            defaultTimeBar.setId(h4.x.f134870G);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            playerControlView2.f57602E = defaultTimeBar;
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
            playerControlView2.f57602E = null;
        }
        D d11 = playerControlView2.f57602E;
        if (d11 != null) {
            d11.a(cVar);
        }
        Resources resources = context2.getResources();
        playerControlView2.f57623b = resources;
        ImageView imageView5 = (ImageView) playerControlView2.findViewById(h4.x.f134866C);
        playerControlView2.f57649o = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(cVar);
        }
        ImageView imageView6 = (ImageView) playerControlView2.findViewById(h4.x.f134869F);
        playerControlView2.f57645m = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(P.W(context2, resources, i23));
            imageView6.setOnClickListener(cVar);
        }
        ImageView imageView7 = (ImageView) playerControlView2.findViewById(h4.x.f134908y);
        playerControlView2.f57647n = imageView7;
        if (imageView7 != null) {
            imageView7.setImageDrawable(P.W(context2, resources, i19));
            imageView7.setOnClickListener(cVar);
        }
        Typeface typefaceH = C6327h.h(context2, h4.w.f134863a);
        ImageView imageView8 = (ImageView) playerControlView2.findViewById(h4.x.f134873J);
        TextView textView2 = (TextView) playerControlView2.findViewById(h4.x.f134874K);
        if (imageView8 != null) {
            imageView8.setImageDrawable(P.W(context2, resources, i31));
            playerControlView2.f57653q = imageView8;
            playerControlView2.f57657s = textView;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceH);
            playerControlView2.f57657s = textView2;
            playerControlView2.f57653q = textView2;
        } else {
            playerControlView2.f57657s = textView;
            playerControlView2.f57653q = textView;
        }
        View view = playerControlView2.f57653q;
        if (view != null) {
            view.setOnClickListener(cVar);
        }
        ImageView imageView9 = (ImageView) playerControlView2.findViewById(h4.x.f134900q);
        TextView textView3 = (TextView) playerControlView2.findViewById(h4.x.f134901r);
        if (imageView9 != null) {
            imageView9.setImageDrawable(P.W(context2, resources, i22));
            playerControlView2.f57651p = imageView9;
            playerControlView2.f57655r = textView;
        } else if (textView3 != null) {
            textView3.setTypeface(typefaceH);
            playerControlView2.f57655r = textView3;
            playerControlView2.f57651p = textView3;
        } else {
            playerControlView2.f57655r = textView;
            playerControlView2.f57651p = textView;
        }
        View view2 = playerControlView2.f57651p;
        if (view2 != null) {
            view2.setOnClickListener(cVar);
        }
        ImageView imageView10 = (ImageView) playerControlView2.findViewById(h4.x.f134872I);
        playerControlView2.f57659t = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(cVar);
        }
        ImageView imageView11 = (ImageView) playerControlView2.findViewById(h4.x.f134876M);
        playerControlView2.f57661u = imageView11;
        if (imageView11 != null) {
            imageView11.setOnClickListener(cVar);
        }
        playerControlView2.f57618U = resources.getInteger(h4.y.f134911b) / 100.0f;
        playerControlView2.f57619V = resources.getInteger(h4.y.f134910a) / 100.0f;
        ImageView imageView12 = (ImageView) playerControlView2.findViewById(h4.x.f134883T);
        playerControlView2.f57663v = imageView12;
        if (imageView12 != null) {
            imageView12.setImageDrawable(P.W(context2, resources, i12));
            playerControlView2.o0(false, imageView12);
        }
        t tVar = new t(playerControlView2);
        playerControlView2.f57621a = tVar;
        tVar.T(z15);
        h hVar = playerControlView2.new h(new String[]{resources.getString(C14460B.f134731h), resources.getString(C14460B.f134748y)}, new Drawable[]{P.W(context2, resources, h4.v.f134859p), P.W(context2, resources, h4.v.f134845b)});
        playerControlView2.f57631f = hVar;
        playerControlView2.f57643l = resources.getDimensionPixelSize(h4.u.f134840a);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context2).inflate(h4.z.f134915d, (ViewGroup) null);
        playerControlView2.f57629e = recyclerView;
        recyclerView.setAdapter(hVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(playerControlView2.getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        playerControlView2.f57641k = popupWindow;
        if (P.f127888a < 23) {
            z22 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z22 = false;
        }
        popupWindow.setOnDismissListener(cVar);
        playerControlView2.f57672z0 = true;
        playerControlView2.f57639j = new C14466e(playerControlView2.getResources());
        playerControlView2.f57624b0 = P.W(context2, resources, i14);
        playerControlView2.f57626c0 = P.W(context2, resources, i21);
        playerControlView2.f57628d0 = resources.getString(C14460B.f134725b);
        playerControlView2.f57630e0 = resources.getString(C14460B.f134724a);
        playerControlView2.f57635h = new j();
        playerControlView2.f57637i = new b();
        playerControlView2.f57633g = playerControlView2.new e(resources.getStringArray(h4.s.f134838a), f57597A0);
        playerControlView2.f57608K = P.W(context2, resources, i11);
        playerControlView2.f57609L = P.W(context2, resources, i26);
        playerControlView2.f57632f0 = P.W(context2, resources, i30);
        playerControlView2.f57634g0 = P.W(context2, resources, i29);
        playerControlView2.f57610M = P.W(context2, resources, i28);
        playerControlView2.f57611N = P.W(context2, resources, i16);
        playerControlView2.f57612O = P.W(context2, resources, i17);
        playerControlView2.f57616S = P.W(context2, resources, i18);
        playerControlView2.f57617T = P.W(context2, resources, i20);
        playerControlView2.f57636h0 = resources.getString(C14460B.f134727d);
        playerControlView2.f57638i0 = resources.getString(C14460B.f134726c);
        playerControlView2.f57613P = resources.getString(C14460B.f134733j);
        playerControlView2.f57614Q = resources.getString(C14460B.f134734k);
        playerControlView2.f57615R = resources.getString(C14460B.f134732i);
        playerControlView2.f57620W = resources.getString(C14460B.f134737n);
        playerControlView2.f57622a0 = resources.getString(C14460B.f134736m);
        tVar.U((ViewGroup) playerControlView2.findViewById(h4.x.f134888e), true);
        tVar.U(playerControlView2.f57651p, z18);
        tVar.U(playerControlView2.f57653q, z20);
        tVar.U(imageView6, z21);
        tVar.U(imageView7, z19);
        tVar.U(imageView11, z12);
        tVar.U(imageView, z13);
        tVar.U(imageView12, z14);
        tVar.U(imageView10, playerControlView2.f57660t0 != 0 ? true : z22);
        playerControlView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: h4.h
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i51, int i52, int i53, int i54, int i55, int i56, int i57, int i58) {
                this.f134833a.h0(view3, i51, i52, i53, i54, i55, i56, i57, i58);
            }
        });
    }

    private void A0() {
        this.f57629e.measure(0, 0);
        this.f57641k.setWidth(Math.min(this.f57629e.getMeasuredWidth(), getWidth() - (this.f57643l * 2)));
        this.f57641k.setHeight(Math.min(getHeight() - (this.f57643l * 2), this.f57629e.getMeasuredHeight()));
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
            if (fY.n(i10, cVar).f44445m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(RecyclerView.h<?> hVar, View view) {
        this.f57629e.setAdapter(hVar);
        A0();
        this.f57672z0 = false;
        this.f57641k.dismiss();
        this.f57672z0 = true;
        this.f57641k.showAsDropDown(view, (getWidth() - this.f57641k.getWidth()) - this.f57643l, (-this.f57641k.getHeight()) - this.f57643l);
    }

    private L<k> W(J j10, int i10) {
        L.a aVar = new L.a();
        L<J.a> lA = j10.a();
        for (int i11 = 0; i11 < lA.size(); i11++) {
            J.a aVar2 = lA.get(i11);
            if (aVar2.c() == i10) {
                for (int i12 = 0; i12 < aVar2.f44575a; i12++) {
                    if (aVar2.h(i12)) {
                        a3.t tVarB = aVar2.b(i12);
                        if ((tVarB.f44757e & 2) == 0) {
                            aVar.a(new k(j10, i11, i12, this.f57639j.a(tVarB)));
                        }
                    }
                }
            }
        }
        return aVar.k();
    }

    private static int X(TypedArray typedArray, int i10) {
        return typedArray.getInt(h4.D.f134762L, i10);
    }

    private void a0() {
        this.f57635h.c();
        this.f57637i.c();
        a3.B b10 = this.f57640j0;
        if (b10 != null && b10.v(30) && this.f57640j0.v(29)) {
            J jR = this.f57640j0.r();
            this.f57637i.m(W(jR, 1));
            if (this.f57621a.A(this.f57665w)) {
                this.f57635h.l(W(jR, 3));
            } else {
                this.f57635h.l(L.x());
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
        s0(!this.f57644l0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(int i10) {
        if (i10 == 0) {
            V(this.f57633g, (View) C13599a.e(this.f57671z));
        } else if (i10 == 1) {
            V(this.f57637i, (View) C13599a.e(this.f57671z));
        } else {
            this.f57641k.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(a3.B b10, long j10) {
        if (this.f57652p0) {
            if (b10.v(17) && b10.v(10)) {
                F fY = b10.y();
                int iP = fY.p();
                int i10 = 0;
                while (true) {
                    long jD = fY.n(i10, this.f57606I).d();
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
        view.setAlpha(z10 ? this.f57618U : this.f57619V);
    }

    private void p0() {
        a3.B b10 = this.f57640j0;
        int iR = (int) ((b10 != null ? b10.R() : 15000L) / 1000);
        TextView textView = this.f57655r;
        if (textView != null) {
            textView.setText(String.valueOf(iR));
        }
        View view = this.f57651p;
        if (view != null) {
            view.setContentDescription(this.f57623b.getQuantityString(C14459A.f134717a, iR, Integer.valueOf(iR)));
        }
    }

    private void q0(ImageView imageView, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (z10) {
            imageView.setImageDrawable(this.f57632f0);
            imageView.setContentDescription(this.f57636h0);
        } else {
            imageView.setImageDrawable(this.f57634g0);
            imageView.setContentDescription(this.f57638i0);
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
        a3.B b10 = this.f57640j0;
        if (b10 == null || !b10.v(13)) {
            return;
        }
        a3.B b11 = this.f57640j0;
        b11.d(b11.f().b(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        a3.B b10 = this.f57640j0;
        if (b10 == null) {
            return;
        }
        this.f57633g.i(b10.f().f44370a);
        this.f57631f.h(0, this.f57633g.c());
        z0();
    }

    private void y0() {
        a3.B b10 = this.f57640j0;
        int iH0 = (int) ((b10 != null ? b10.h0() : 5000L) / 1000);
        TextView textView = this.f57657s;
        if (textView != null) {
            textView.setText(String.valueOf(iH0));
        }
        View view = this.f57653q;
        if (view != null) {
            view.setContentDescription(this.f57623b.getQuantityString(C14459A.f134718b, iH0, Integer.valueOf(iH0)));
        }
    }

    private void z0() {
        o0(this.f57631f.a(), this.f57671z);
    }

    public void Y() {
        this.f57621a.C();
    }

    public void Z() {
        this.f57621a.F();
    }

    public boolean c0() {
        return this.f57621a.I();
    }

    void f0() {
        Iterator<m> it = this.f57627d.iterator();
        while (it.hasNext()) {
            it.next().B(getVisibility());
        }
    }

    public a3.B getPlayer() {
        return this.f57640j0;
    }

    public int getRepeatToggleModes() {
        return this.f57660t0;
    }

    public boolean getShowShuffleButton() {
        return this.f57621a.A(this.f57661u);
    }

    public boolean getShowSubtitleButton() {
        return this.f57621a.A(this.f57665w);
    }

    public int getShowTimeoutMs() {
        return this.f57656r0;
    }

    public boolean getShowVrButton() {
        return this.f57621a.A(this.f57663v);
    }

    @Deprecated
    public void j0(m mVar) {
        this.f57627d.remove(mVar);
    }

    void k0() {
        ImageView imageView = this.f57649o;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void m0() {
        this.f57621a.X();
    }

    public void s0(boolean z10) {
        if (this.f57644l0 == z10) {
            return;
        }
        this.f57644l0 = z10;
        q0(this.f57667x, z10);
        q0(this.f57669y, z10);
        d dVar = this.f57642k0;
        if (dVar != null) {
            dVar.E(z10);
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.f57621a.T(z10);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(d dVar) {
        this.f57642k0 = dVar;
        r0(this.f57667x, dVar != null);
        r0(this.f57669y, dVar != null);
    }

    public void setRepeatToggleModes(int i10) {
        this.f57660t0 = i10;
        a3.B b10 = this.f57640j0;
        if (b10 != null && b10.v(15)) {
            int iA0 = this.f57640j0.a0();
            if (i10 == 0 && iA0 != 0) {
                this.f57640j0.X(0);
            } else if (i10 == 1 && iA0 == 2) {
                this.f57640j0.X(1);
            } else if (i10 == 2 && iA0 == 1) {
                this.f57640j0.X(2);
            }
        }
        this.f57621a.U(this.f57659t, i10 != 0);
        x0();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f57621a.U(this.f57651p, z10);
        t0();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f57648n0 = z10;
        C0();
    }

    public void setShowNextButton(boolean z10) {
        this.f57621a.U(this.f57647n, z10);
        t0();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.f57650o0 = z10;
        u0();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f57621a.U(this.f57645m, z10);
        t0();
    }

    public void setShowRewindButton(boolean z10) {
        this.f57621a.U(this.f57653q, z10);
        t0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f57621a.U(this.f57661u, z10);
        B0();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f57621a.U(this.f57665w, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f57656r0 = i10;
        if (c0()) {
            this.f57621a.S();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f57621a.U(this.f57663v, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f57658s0 = P.o(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f57663v;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            o0(onClickListener != null, this.f57663v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (e0() && this.f57646m0 && (imageView = this.f57661u) != null) {
            a3.B b10 = this.f57640j0;
            if (!this.f57621a.A(imageView)) {
                o0(false, this.f57661u);
                return;
            }
            if (b10 != null && b10.v(14)) {
                o0(true, this.f57661u);
                ImageView imageView2 = this.f57661u;
                if (b10.b0()) {
                    drawable = this.f57616S;
                } else {
                    drawable = this.f57617T;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.f57661u;
                if (b10.b0()) {
                    str = this.f57620W;
                } else {
                    str = this.f57622a0;
                }
                imageView3.setContentDescription(str);
                return;
            }
            o0(false, this.f57661u);
            this.f57661u.setImageDrawable(this.f57617T);
            this.f57661u.setContentDescription(this.f57622a0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        boolean z10;
        a0();
        if (this.f57635h.getItemCount() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        o0(z10, this.f57665w);
        z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        boolean zV;
        boolean zV2;
        boolean zV3;
        boolean zV4;
        boolean zV5;
        if (e0() && this.f57646m0) {
            a3.B b10 = this.f57640j0;
            if (b10 != null) {
                if (this.f57648n0 && T(b10, this.f57606I)) {
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
            o0(zV3, this.f57645m);
            o0(zV4, this.f57653q);
            o0(zV5, this.f57651p);
            o0(zV2, this.f57647n);
            D d10 = this.f57602E;
            if (d10 != null) {
                d10.setEnabled(zV);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        Drawable drawable;
        int i10;
        if (e0() && this.f57646m0 && this.f57649o != null) {
            boolean zB1 = P.b1(this.f57640j0, this.f57650o0);
            if (zB1) {
                drawable = this.f57608K;
            } else {
                drawable = this.f57609L;
            }
            if (zB1) {
                i10 = C14460B.f134730g;
            } else {
                i10 = C14460B.f134729f;
            }
            this.f57649o.setImageDrawable(drawable);
            this.f57649o.setContentDescription(this.f57623b.getString(i10));
            o0(P.a1(this.f57640j0), this.f57649o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        long jS;
        long jC0;
        int iU;
        long preferredUpdateDelay;
        if (e0() && this.f57646m0) {
            a3.B b10 = this.f57640j0;
            if (b10 != null && b10.v(16)) {
                jS = this.f57670y0 + b10.S();
                jC0 = this.f57670y0 + b10.c0();
            } else {
                jS = 0;
                jC0 = 0;
            }
            TextView textView = this.f57601D;
            if (textView != null && !this.f57654q0) {
                textView.setText(P.k0(this.f57603F, this.f57604G, jS));
            }
            D d10 = this.f57602E;
            if (d10 != null) {
                d10.setPosition(jS);
                this.f57602E.setBufferedPosition(jC0);
            }
            removeCallbacks(this.f57607J);
            if (b10 == null) {
                iU = 1;
            } else {
                iU = b10.U();
            }
            long j10 = 1000;
            if (b10 != null && b10.V()) {
                D d11 = this.f57602E;
                if (d11 != null) {
                    preferredUpdateDelay = d11.getPreferredUpdateDelay();
                } else {
                    preferredUpdateDelay = 1000;
                }
                long jMin = Math.min(preferredUpdateDelay, 1000 - (jS % 1000));
                float f10 = b10.f().f44370a;
                if (f10 > 0.0f) {
                    j10 = (long) (jMin / f10);
                }
                postDelayed(this.f57607J, P.p(j10, this.f57658s0, 1000L));
                return;
            }
            if (iU != 4 && iU != 1) {
                postDelayed(this.f57607J, 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0() {
        ImageView imageView;
        if (e0() && this.f57646m0 && (imageView = this.f57659t) != null) {
            if (this.f57660t0 == 0) {
                o0(false, imageView);
                return;
            }
            a3.B b10 = this.f57640j0;
            if (b10 != null && b10.v(15)) {
                o0(true, this.f57659t);
                int iA0 = b10.a0();
                if (iA0 != 0) {
                    if (iA0 != 1) {
                        if (iA0 == 2) {
                            this.f57659t.setImageDrawable(this.f57612O);
                            this.f57659t.setContentDescription(this.f57615R);
                            return;
                        }
                        return;
                    }
                    this.f57659t.setImageDrawable(this.f57611N);
                    this.f57659t.setContentDescription(this.f57614Q);
                    return;
                }
                this.f57659t.setImageDrawable(this.f57610M);
                this.f57659t.setContentDescription(this.f57613P);
                return;
            }
            o0(false, this.f57659t);
            this.f57659t.setImageDrawable(this.f57610M);
            this.f57659t.setContentDescription(this.f57613P);
        }
    }

    @Deprecated
    public void S(m mVar) {
        C13599a.e(mVar);
        this.f57627d.add(mVar);
    }

    public boolean U(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a3.B b10 = this.f57640j0;
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
                    P.t0(b10, this.f57650o0);
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
        this.f57621a.K();
        this.f57646m0 = true;
        if (c0()) {
            this.f57621a.S();
        }
        n0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57621a.L();
        this.f57646m0 = false;
        removeCallbacks(this.f57607J);
        this.f57621a.R();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f57621a.M(z10, i10, i11, i12, i13);
    }

    public void setPlayer(a3.B b10) {
        boolean z10;
        boolean z11 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.g(z10);
        if (b10 == null || b10.z() == Looper.getMainLooper()) {
            z11 = true;
        }
        C13599a.a(z11);
        a3.B b11 = this.f57640j0;
        if (b11 == b10) {
            return;
        }
        if (b11 != null) {
            b11.Z(this.f57625c);
        }
        this.f57640j0 = b10;
        if (b10 != null) {
            b10.l(this.f57625c);
        }
        n0();
    }
}
