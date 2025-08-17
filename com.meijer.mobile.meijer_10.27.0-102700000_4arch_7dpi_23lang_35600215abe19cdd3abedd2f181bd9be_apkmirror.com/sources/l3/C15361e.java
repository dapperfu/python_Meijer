package l3;

import Ce.L;
import a3.B;
import a3.F;
import a3.InterfaceC5563c;
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
import d3.C13466a;
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
import l3.C15362f;

/* renamed from: l3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15361e implements androidx.media3.exoplayer.source.ads.a {

    /* renamed from: a, reason: collision with root package name */
    private final C15362f.a f148458a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f148459b;

    /* renamed from: c, reason: collision with root package name */
    private final C15362f.b f148460c;

    /* renamed from: d, reason: collision with root package name */
    private final d f148461d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<Object, C15360d> f148462e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<AdsMediaSource, C15360d> f148463f;

    /* renamed from: g, reason: collision with root package name */
    private final F.b f148464g;

    /* renamed from: h, reason: collision with root package name */
    private final F.c f148465h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f148466i;

    /* renamed from: j, reason: collision with root package name */
    private B f148467j;

    /* renamed from: k, reason: collision with root package name */
    private List<String> f148468k;

    /* renamed from: l, reason: collision with root package name */
    private B f148469l;

    /* renamed from: m, reason: collision with root package name */
    private C15360d f148470m;

    /* renamed from: l3.e$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f148471a;

        /* renamed from: b, reason: collision with root package name */
        private ImaSdkSettings f148472b;

        /* renamed from: c, reason: collision with root package name */
        private AdErrorEvent.AdErrorListener f148473c;

        /* renamed from: d, reason: collision with root package name */
        private AdEvent.AdEventListener f148474d;

        /* renamed from: e, reason: collision with root package name */
        private VideoAdPlayer.VideoAdPlayerCallback f148475e;

        /* renamed from: f, reason: collision with root package name */
        private List<String> f148476f;

        /* renamed from: g, reason: collision with root package name */
        private Set<UiElement> f148477g;

        /* renamed from: h, reason: collision with root package name */
        private Collection<CompanionAdSlot> f148478h;

        /* renamed from: i, reason: collision with root package name */
        private Boolean f148479i;

        /* renamed from: p, reason: collision with root package name */
        private boolean f148486p;

        /* renamed from: j, reason: collision with root package name */
        private long f148480j = 10000;

        /* renamed from: k, reason: collision with root package name */
        private int f148481k = -1;

        /* renamed from: l, reason: collision with root package name */
        private int f148482l = -1;

        /* renamed from: m, reason: collision with root package name */
        private int f148483m = -1;

        /* renamed from: n, reason: collision with root package name */
        private boolean f148484n = true;

        /* renamed from: o, reason: collision with root package name */
        private boolean f148485o = true;

        /* renamed from: q, reason: collision with root package name */
        private C15362f.b f148487q = new c();

        public C15361e a() {
            return new C15361e(this.f148471a, new C15362f.a(this.f148480j, this.f148481k, this.f148482l, this.f148484n, this.f148485o, this.f148483m, this.f148479i, this.f148476f, this.f148477g, this.f148478h, this.f148473c, this.f148474d, this.f148475e, this.f148472b, this.f148486p), this.f148487q);
        }

        public b(Context context) {
            this.f148471a = ((Context) C13466a.e(context)).getApplicationContext();
        }
    }

    /* renamed from: l3.e$d */
    private final class d implements B.d {
        private d() {
        }

        @Override // a3.B.d
        public void D0(int i10) {
            C15361e.this.j();
        }

        @Override // a3.B.d
        public void I0(boolean z10) {
            C15361e.this.j();
        }

        @Override // a3.B.d
        public void W0(B.e eVar, B.e eVar2, int i10) {
            C15361e.this.k();
            C15361e.this.j();
        }

        @Override // a3.B.d
        public void N0(F f10, int i10) {
            if (!f10.q()) {
                C15361e.this.k();
                C15361e.this.j();
            }
        }
    }

    /* renamed from: l3.e$c */
    private static final class c implements C15362f.b {
        private c() {
        }

        @Override // l3.C15362f.b
        public AdsLoader a(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
            return ImaSdkFactory.getInstance().createAdsLoader(context, imaSdkSettings, adDisplayContainer);
        }

        @Override // l3.C15362f.b
        public AdDisplayContainer b(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
            return ImaSdkFactory.createAdDisplayContainer(viewGroup, videoAdPlayer);
        }

        @Override // l3.C15362f.b
        public ImaSdkSettings c() {
            ImaSdkSettings imaSdkSettingsCreateImaSdkSettings = ImaSdkFactory.getInstance().createImaSdkSettings();
            imaSdkSettingsCreateImaSdkSettings.setLanguage(P.l0()[0]);
            return imaSdkSettingsCreateImaSdkSettings;
        }

        @Override // l3.C15362f.b
        public FriendlyObstruction d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
            return ImaSdkFactory.getInstance().createFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }

        @Override // l3.C15362f.b
        public AdsRenderingSettings e() {
            return ImaSdkFactory.getInstance().createAdsRenderingSettings();
        }

        @Override // l3.C15362f.b
        public AdsRequest f() {
            return ImaSdkFactory.getInstance().createAdsRequest();
        }

        @Override // l3.C15362f.b
        public AdDisplayContainer g(Context context, VideoAdPlayer videoAdPlayer) {
            return ImaSdkFactory.createAudioAdDisplayContainer(context, videoAdPlayer);
        }
    }

    static {
        w.a("media3.exoplayer.ima");
    }

    private C15361e(Context context, C15362f.a aVar, C15362f.b bVar) {
        this.f148459b = context.getApplicationContext();
        this.f148458a = aVar;
        this.f148460c = bVar;
        this.f148461d = new d();
        this.f148468k = L.x();
        this.f148462e = new HashMap<>();
        this.f148463f = new HashMap<>();
        this.f148464g = new F.b();
        this.f148465h = new F.c();
    }

    private C15360d i() {
        Object objI;
        C15360d c15360d;
        B b10 = this.f148469l;
        if (b10 == null) {
            return null;
        }
        F fY = b10.y();
        if (fY.q() || (objI = fY.f(b10.J(), this.f148464g).i()) == null || (c15360d = this.f148462e.get(objI)) == null || !this.f148463f.containsValue(c15360d)) {
            return null;
        }
        return c15360d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        int iD;
        C15360d c15360d;
        B b10 = this.f148469l;
        if (b10 == null) {
            return;
        }
        F fY = b10.y();
        if (fY.q() || (iD = fY.d(b10.J(), this.f148464g, this.f148465h, b10.a0(), b10.b0())) == -1) {
            return;
        }
        fY.f(iD, this.f148464g);
        Object objI = this.f148464g.i();
        if (objI == null || (c15360d = this.f148462e.get(objI)) == null || c15360d == this.f148470m) {
            return;
        }
        F.c cVar = this.f148465h;
        F.b bVar = this.f148464g;
        c15360d.l1(P.j1(((Long) fY.j(cVar, bVar, bVar.f43594c, -9223372036854775807L).second).longValue()), P.j1(this.f148464g.f43595d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        C15360d c15360d = this.f148470m;
        C15360d c15360dI = i();
        if (Objects.equals(c15360d, c15360dI)) {
            return;
        }
        if (c15360d != null) {
            c15360d.k0();
        }
        this.f148470m = c15360dI;
        if (c15360dI != null) {
            c15360dI.i0((B) C13466a.e(this.f148469l));
        }
    }

    @Override // androidx.media3.exoplayer.source.ads.a
    public void a(AdsMediaSource adsMediaSource, a.InterfaceC1127a interfaceC1127a) {
        C15360d c15360dRemove = this.f148463f.remove(adsMediaSource);
        k();
        if (c15360dRemove != null) {
            c15360dRemove.p1(interfaceC1127a);
        }
        if (this.f148469l == null || !this.f148463f.isEmpty()) {
            return;
        }
        this.f148469l.Z(this.f148461d);
        this.f148469l = null;
    }

    @Override // androidx.media3.exoplayer.source.ads.a
    public void b(AdsMediaSource adsMediaSource, g gVar, Object obj, InterfaceC5563c interfaceC5563c, a.InterfaceC1127a interfaceC1127a) {
        C13466a.h(this.f148466i, "Set player using adsLoader.setPlayer before preparing the player.");
        if (this.f148463f.isEmpty()) {
            B b10 = this.f148467j;
            this.f148469l = b10;
            if (b10 == null) {
                return;
            } else {
                b10.l(this.f148461d);
            }
        }
        C15360d c15360d = this.f148462e.get(obj);
        if (c15360d == null) {
            m(gVar, obj, interfaceC5563c.getAdViewGroup());
            c15360d = this.f148462e.get(obj);
        }
        this.f148463f.put(adsMediaSource, (C15360d) C13466a.e(c15360d));
        c15360d.j0(interfaceC1127a, interfaceC5563c);
        k();
    }

    @Override // androidx.media3.exoplayer.source.ads.a
    public void c(AdsMediaSource adsMediaSource, int i10, int i11) {
        if (this.f148469l == null) {
            return;
        }
        ((C15360d) C13466a.e(this.f148463f.get(adsMediaSource))).A0(i10, i11);
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
        this.f148468k = Collections.unmodifiableList(arrayList);
    }

    @Override // androidx.media3.exoplayer.source.ads.a
    public void e(AdsMediaSource adsMediaSource, int i10, int i11, IOException iOException) {
        if (this.f148469l == null) {
            return;
        }
        ((C15360d) C13466a.e(this.f148463f.get(adsMediaSource))).B0(i10, i11, iOException);
    }

    public void l() {
        B b10 = this.f148469l;
        if (b10 != null) {
            b10.Z(this.f148461d);
            this.f148469l = null;
            k();
        }
        this.f148467j = null;
        Iterator<C15360d> it = this.f148463f.values().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.f148463f.clear();
        Iterator<C15360d> it2 = this.f148462e.values().iterator();
        while (it2.hasNext()) {
            it2.next().release();
        }
        this.f148462e.clear();
    }

    public void m(g gVar, Object obj, ViewGroup viewGroup) {
        if (this.f148462e.containsKey(obj)) {
            return;
        }
        this.f148462e.put(obj, new C15360d(this.f148459b, this.f148458a, this.f148460c, this.f148468k, gVar, obj, viewGroup));
    }

    public void n(B b10) {
        boolean z10;
        boolean z11 = false;
        if (Looper.myLooper() == C15362f.d()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.g(z10);
        if (b10 == null || b10.z() == C15362f.d()) {
            z11 = true;
        }
        C13466a.g(z11);
        this.f148467j = b10;
        this.f148466i = true;
    }
}
