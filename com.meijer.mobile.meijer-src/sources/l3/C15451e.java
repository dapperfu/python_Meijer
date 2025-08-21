package l3;

import Ee.L;
import a3.B;
import a3.F;
import a3.InterfaceC5646c;
import a3.w;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.source.ads.a;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import d3.C13599a;
import d3.P;
import f3.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import l3.C15452f;

/* renamed from: l3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15451e implements androidx.media3.exoplayer.source.ads.a {

    /* renamed from: a, reason: collision with root package name */
    private final C15452f.a f149245a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f149246b;

    /* renamed from: c, reason: collision with root package name */
    private final C15452f.b f149247c;

    /* renamed from: d, reason: collision with root package name */
    private final d f149248d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<Object, C15450d> f149249e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<AdsMediaSource, C15450d> f149250f;

    /* renamed from: g, reason: collision with root package name */
    private final F.b f149251g;

    /* renamed from: h, reason: collision with root package name */
    private final F.c f149252h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f149253i;

    /* renamed from: j, reason: collision with root package name */
    private B f149254j;

    /* renamed from: k, reason: collision with root package name */
    private List<String> f149255k;

    /* renamed from: l, reason: collision with root package name */
    private B f149256l;

    /* renamed from: m, reason: collision with root package name */
    private C15450d f149257m;

    /* renamed from: l3.e$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f149258a;

        /* renamed from: b, reason: collision with root package name */
        private ImaSdkSettings f149259b;

        /* renamed from: c, reason: collision with root package name */
        private AdErrorEvent.AdErrorListener f149260c;

        /* renamed from: d, reason: collision with root package name */
        private AdEvent.AdEventListener f149261d;

        /* renamed from: e, reason: collision with root package name */
        private VideoAdPlayer.VideoAdPlayerCallback f149262e;

        /* renamed from: f, reason: collision with root package name */
        private List<String> f149263f;

        /* renamed from: g, reason: collision with root package name */
        private Set<UiElement> f149264g;

        /* renamed from: h, reason: collision with root package name */
        private Collection<CompanionAdSlot> f149265h;

        /* renamed from: i, reason: collision with root package name */
        private Boolean f149266i;

        /* renamed from: p, reason: collision with root package name */
        private boolean f149273p;

        /* renamed from: j, reason: collision with root package name */
        private long f149267j = 10000;

        /* renamed from: k, reason: collision with root package name */
        private int f149268k = -1;

        /* renamed from: l, reason: collision with root package name */
        private int f149269l = -1;

        /* renamed from: m, reason: collision with root package name */
        private int f149270m = -1;

        /* renamed from: n, reason: collision with root package name */
        private boolean f149271n = true;

        /* renamed from: o, reason: collision with root package name */
        private boolean f149272o = true;

        /* renamed from: q, reason: collision with root package name */
        private C15452f.b f149274q = new c();

        public C15451e a() {
            return new C15451e(this.f149258a, new C15452f.a(this.f149267j, this.f149268k, this.f149269l, this.f149271n, this.f149272o, this.f149270m, this.f149266i, this.f149263f, this.f149264g, this.f149265h, this.f149260c, this.f149261d, this.f149262e, this.f149259b, this.f149273p), this.f149274q);
        }

        public b(Context context) {
            this.f149258a = ((Context) C13599a.e(context)).getApplicationContext();
        }
    }

    /* renamed from: l3.e$d */
    private final class d implements B.d {
        private d() {
        }

        @Override // a3.B.d
        public void G0(int i10) {
            C15451e.this.j();
        }

        @Override // a3.B.d
        public void L0(boolean z10) {
            C15451e.this.j();
        }

        @Override // a3.B.d
        public void Z0(B.e eVar, B.e eVar2, int i10) {
            C15451e.this.k();
            C15451e.this.j();
        }

        @Override // a3.B.d
        public void Q0(F f10, int i10) {
            if (!f10.q()) {
                C15451e.this.k();
                C15451e.this.j();
            }
        }
    }

    /* renamed from: l3.e$c */
    private static final class c implements C15452f.b {
        private c() {
        }

        @Override // l3.C15452f.b
        public AdsLoader a(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
            return ImaSdkFactory.getInstance().createAdsLoader(context, imaSdkSettings, adDisplayContainer);
        }

        @Override // l3.C15452f.b
        public AdDisplayContainer b(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
            return ImaSdkFactory.createAdDisplayContainer(viewGroup, videoAdPlayer);
        }

        @Override // l3.C15452f.b
        public ImaSdkSettings c() {
            ImaSdkSettings imaSdkSettingsCreateImaSdkSettings = ImaSdkFactory.getInstance().createImaSdkSettings();
            imaSdkSettingsCreateImaSdkSettings.setLanguage(P.l0()[0]);
            return imaSdkSettingsCreateImaSdkSettings;
        }

        @Override // l3.C15452f.b
        public FriendlyObstruction d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
            return ImaSdkFactory.getInstance().createFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }

        @Override // l3.C15452f.b
        public AdsRenderingSettings e() {
            return ImaSdkFactory.getInstance().createAdsRenderingSettings();
        }

        @Override // l3.C15452f.b
        public AdsRequest f() {
            return ImaSdkFactory.getInstance().createAdsRequest();
        }

        @Override // l3.C15452f.b
        public AdDisplayContainer g(Context context, VideoAdPlayer videoAdPlayer) {
            return ImaSdkFactory.createAudioAdDisplayContainer(context, videoAdPlayer);
        }
    }

    static {
        w.a("media3.exoplayer.ima");
    }

    private C15451e(Context context, C15452f.a aVar, C15452f.b bVar) {
        this.f149246b = context.getApplicationContext();
        this.f149245a = aVar;
        this.f149247c = bVar;
        this.f149248d = new d();
        this.f149255k = L.x();
        this.f149249e = new HashMap<>();
        this.f149250f = new HashMap<>();
        this.f149251g = new F.b();
        this.f149252h = new F.c();
    }

    private C15450d i() {
        Object objI;
        C15450d c15450d;
        B b10 = this.f149256l;
        if (b10 == null) {
            return null;
        }
        F fY = b10.y();
        if (fY.q() || (objI = fY.f(b10.J(), this.f149251g).i()) == null || (c15450d = this.f149249e.get(objI)) == null || !this.f149250f.containsValue(c15450d)) {
            return null;
        }
        return c15450d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        int iD;
        C15450d c15450d;
        B b10 = this.f149256l;
        if (b10 == null) {
            return;
        }
        F fY = b10.y();
        if (fY.q() || (iD = fY.d(b10.J(), this.f149251g, this.f149252h, b10.a0(), b10.b0())) == -1) {
            return;
        }
        fY.f(iD, this.f149251g);
        Object objI = this.f149251g.i();
        if (objI == null || (c15450d = this.f149249e.get(objI)) == null || c15450d == this.f149257m) {
            return;
        }
        F.c cVar = this.f149252h;
        F.b bVar = this.f149251g;
        c15450d.l1(P.j1(((Long) fY.j(cVar, bVar, bVar.f44412c, -9223372036854775807L).second).longValue()), P.j1(this.f149251g.f44413d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        C15450d c15450d = this.f149257m;
        C15450d c15450dI = i();
        if (Objects.equals(c15450d, c15450dI)) {
            return;
        }
        if (c15450d != null) {
            c15450d.k0();
        }
        this.f149257m = c15450dI;
        if (c15450dI != null) {
            c15450dI.i0((B) C13599a.e(this.f149256l));
        }
    }

    @Override // androidx.media3.exoplayer.source.ads.a
    public void a(AdsMediaSource adsMediaSource, a.InterfaceC1140a interfaceC1140a) {
        C15450d c15450dRemove = this.f149250f.remove(adsMediaSource);
        k();
        if (c15450dRemove != null) {
            c15450dRemove.p1(interfaceC1140a);
        }
        if (this.f149256l == null || !this.f149250f.isEmpty()) {
            return;
        }
        this.f149256l.Z(this.f149248d);
        this.f149256l = null;
    }

    @Override // androidx.media3.exoplayer.source.ads.a
    public void b(AdsMediaSource adsMediaSource, g gVar, Object obj, InterfaceC5646c interfaceC5646c, a.InterfaceC1140a interfaceC1140a) {
        C13599a.h(this.f149253i, "Set player using adsLoader.setPlayer before preparing the player.");
        if (this.f149250f.isEmpty()) {
            B b10 = this.f149254j;
            this.f149256l = b10;
            if (b10 == null) {
                return;
            } else {
                b10.l(this.f149248d);
            }
        }
        C15450d c15450d = this.f149249e.get(obj);
        if (c15450d == null) {
            m(gVar, obj, interfaceC5646c.getAdViewGroup());
            c15450d = this.f149249e.get(obj);
        }
        this.f149250f.put(adsMediaSource, (C15450d) C13599a.e(c15450d));
        c15450d.j0(interfaceC1140a, interfaceC5646c);
        k();
    }

    @Override // androidx.media3.exoplayer.source.ads.a
    public void c(AdsMediaSource adsMediaSource, int i10, int i11) {
        if (this.f149256l == null) {
            return;
        }
        ((C15450d) C13599a.e(this.f149250f.get(adsMediaSource))).A0(i10, i11);
    }

    @Override // androidx.media3.exoplayer.source.ads.a
    public void d(int... iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 == 0) {
                arrayList.add("application/dash+xml");
            } else if (i10 == 2) {
                arrayList.add("application/x-mpegURL");
            } else if (i10 == 4) {
                arrayList.addAll(Arrays.asList("video/mp4", "video/webm", "video/3gpp", "audio/mp4", "audio/mpeg"));
            }
        }
        this.f149255k = Collections.unmodifiableList(arrayList);
    }

    @Override // androidx.media3.exoplayer.source.ads.a
    public void e(AdsMediaSource adsMediaSource, int i10, int i11, IOException iOException) {
        if (this.f149256l == null) {
            return;
        }
        ((C15450d) C13599a.e(this.f149250f.get(adsMediaSource))).B0(i10, i11, iOException);
    }

    public void l() {
        B b10 = this.f149256l;
        if (b10 != null) {
            b10.Z(this.f149248d);
            this.f149256l = null;
            k();
        }
        this.f149254j = null;
        Iterator<C15450d> it = this.f149250f.values().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.f149250f.clear();
        Iterator<C15450d> it2 = this.f149249e.values().iterator();
        while (it2.hasNext()) {
            it2.next().release();
        }
        this.f149249e.clear();
    }

    public void m(g gVar, Object obj, ViewGroup viewGroup) {
        if (this.f149249e.containsKey(obj)) {
            return;
        }
        this.f149249e.put(obj, new C15450d(this.f149246b, this.f149245a, this.f149247c, this.f149255k, gVar, obj, viewGroup));
    }

    public void n(B b10) {
        boolean z10;
        boolean z11 = false;
        if (Looper.myLooper() == C15452f.d()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.g(z10);
        if (b10 == null || b10.z() == C15452f.d()) {
            z11 = true;
        }
        C13599a.g(z11);
        this.f149254j = b10;
        this.f149253i = true;
    }
}
