package yl;

import com.launchdarkly.sdk.LDValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000¾\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bX\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:M\u001c\u001d\u001e\u001f !\"#$\u001a%&'()*+,-./\u00150123456\u000b\u000f789\u0012\r:;<=\u0011>?@ABCDEFGHI\u0017JKLMNOPQRSTUV\u0010WXYZ\u0013[\\]^B?\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0011\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u001a\u0010\u000e\u0082\u0001q_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0006¨\u0001"}, d2 = {"Lyl/f;", "", "", "title", "description", "remoteId", "", "default", "prerequisite", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLyl/f;)V", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "b", "d", "c", "g", "Z", "()Z", "e", "Lyl/f;", "f", "()Lyl/f;", "internalId", "h", "shortName", "n0", "E", "m0", "G", "v0", "r", "r0", "q", "e0", "F", "j", "d0", "D", "B", "g0", "A", "T", "t0", "S", "u0", "H", "J", "I", "N", "X", "U", "O", "P", "M", "C", "q0", "Y", "c0", "v", "u", "f0", "w", "R", "p", "o", "W", "w0", "s0", "x0", "t", "i0", "Q", "n", "z", "V", "l", "p0", "o0", "k0", "l0", "k", "j0", "L", "y0", "K", "b0", "m", "s", "y", "h0", "a0", "x", "Lyl/f$a;", "Lyl/f$b;", "Lyl/f$c;", "Lyl/f$d;", "Lyl/f$e;", "Lyl/f$f;", "Lyl/f$g;", "Lyl/f$h;", "Lyl/f$i;", "Lyl/f$j;", "Lyl/f$k;", "Lyl/f$l;", "Lyl/f$m;", "Lyl/f$n;", "Lyl/f$o;", "Lyl/f$p;", "Lyl/f$q;", "Lyl/f$r;", "Lyl/f$s;", "Lyl/f$t;", "Lyl/f$u;", "Lyl/f$v;", "Lyl/f$w;", "Lyl/f$x;", "Lyl/f$y;", "Lyl/f$z;", "Lyl/f$A;", "Lyl/f$B;", "Lyl/f$C;", "Lyl/f$D;", "Lyl/f$F;", "Lyl/f$H;", "Lyl/f$I;", "Lyl/f$J;", "Lyl/f$K;", "Lyl/f$L;", "Lyl/f$M;", "Lyl/f$N;", "Lyl/f$O;", "Lyl/f$P;", "Lyl/f$Q;", "Lyl/f$R;", "Lyl/f$S;", "Lyl/f$T;", "Lyl/f$U;", "Lyl/f$V;", "Lyl/f$W;", "Lyl/f$X;", "Lyl/f$Y;", "Lyl/f$Z;", "Lyl/f$a0;", "Lyl/f$b0;", "Lyl/f$c0;", "Lyl/f$d0;", "Lyl/f$e0;", "Lyl/f$f0;", "Lyl/f$g0;", "Lyl/f$h0;", "Lyl/f$i0;", "Lyl/f$j0;", "Lyl/f$k0;", "Lyl/f$l0;", "Lyl/f$o0;", "Lyl/f$p0;", "Lyl/f$q0;", "Lyl/f$r0;", "Lyl/f$s0;", "Lyl/f$t0;", "Lyl/f$u0;", "Lyl/f$v0;", "Lyl/f$w0;", "Lyl/f$x0;", "Lyl/f$y0;", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yl.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC18227f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String remoteId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean default;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC18227f prerequisite;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String internalId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String shortName;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$A;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$A */
    public static final /* data */ class A extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final A f170542h = new A();

        public boolean equals(Object other) {
            return this == other || (other instanceof A);
        }

        private A() {
            super("Enable new Favorites", "Adds a Favorites quick-link to the search screen that will return a PLP with the user's favorite items listed.", "new_favorites_enabled", false, null, 16, null);
        }

        public String toString() {
            return "FavoritesProductList";
        }

        public int hashCode() {
            return 440511147;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$B;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$B */
    public static final /* data */ class B extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final B f170543h = new B();

        public boolean equals(Object other) {
            return this == other || (other instanceof B);
        }

        private B() {
            super("Full Story Tracking", "When enabled, the user session would be recorded through FullStory. Disable to stop tracking.", "full_story_enabled", false, null, 16, null);
        }

        public String toString() {
            return "FullStoryEnabled";
        }

        public int hashCode() {
            return 1771355792;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$C;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$C */
    public static final /* data */ class C extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C f170544h = new C();

        public boolean equals(Object other) {
            return this == other || (other instanceof C);
        }

        private C() {
            super("Enable Google Ad Manager Display Ads", "Enabling this will turn on ads displayed by Google Ad Manger", "mma_enable_iab_display_ads_experience", false, null, 16, null);
        }

        public String toString() {
            return "GoogleAdManagerAds";
        }

        public int hashCode() {
            return -319284300;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lyl/f$D;", "Lyl/f;", "Lyl/f$m0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$D */
    public static final /* data */ class D extends AbstractC18227f implements m0 {

        /* renamed from: h, reason: collision with root package name */
        public static final D f170545h = new D();

        public boolean equals(Object other) {
            return this == other || (other instanceof D);
        }

        private D() {
            super("", "", "hidden_filter_facets", false, null, 16, null);
        }

        public String toString() {
            return "HiddenFacets";
        }

        public int hashCode() {
            return -1010393029;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lyl/f$E;", "", "", "a", "()I", "intValue", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$E */
    public interface E {
        int a();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$F;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$F */
    public static final /* data */ class F extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final F f170546h = new F();

        public boolean equals(Object other) {
            return this == other || (other instanceof F);
        }

        private F() {
            super("Enable Invalid Refresh Token", "Overwrite the refresh token as null for Okta Authentication Tokens.\n\nEnable for testing auto-logout flows, refresh token behaviors, and other authentication-related issues.\n\nYou will need to log in with a fresh session for this to take effect.", null, false, null, 20, null);
        }

        public String toString() {
            return "InvalidRefreshToken";
        }

        public int hashCode() {
            return 918125952;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lyl/f$G;", "", "", "b", "()Ljava/lang/String;", "localTestValue", "Lcom/launchdarkly/sdk/LDValue;", "a", "()Lcom/launchdarkly/sdk/LDValue;", "defaultValue", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$G */
    public interface G {
        default String b() {
            return "";
        }

        default LDValue a() {
            LDValue lDValueU = LDValue.u();
            Intrinsics.i(lDValueU, "ofNull(...)");
            return lDValueU;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$H;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$H */
    public static final /* data */ class H extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final H f170547h = new H();

        public boolean equals(Object other) {
            return this == other || (other instanceof H);
        }

        private H() {
            super("Medallia Survey Enabled", "When enabled, medallia survey menu item (Provide Feedback) is displayed in Home Navigation Menu.", "medallia_survey", false, null, 16, null);
        }

        public String toString() {
            return "MedalliaSurvey";
        }

        public int hashCode() {
            return 2081404156;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$I;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$I */
    public static final /* data */ class I extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final I f170548h = new I();

        public boolean equals(Object other) {
            return this == other || (other instanceof I);
        }

        private I() {
            super("Enable Mperks Dashboard Simplification", "When enabled, you will see a simplified UI of the mPerks dashboard", "mma_mperks_dashboard_simplification_enabled", false, null, 16, null);
        }

        public String toString() {
            return "MperksDashboardSimplifiedUI";
        }

        public int hashCode() {
            return -932506733;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$J;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$J */
    public static final /* data */ class J extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final J f170549h = new J();

        public boolean equals(Object other) {
            return this == other || (other instanceof J);
        }

        private J() {
            super("Enable Mperks New Homescreen UI", "When enable you will be able to see new mPerks section UI on home screen", "mPerks_new_homescreen_ui", false, null, 16, null);
        }

        public String toString() {
            return "MperksNewHomescreenUI";
        }

        public int hashCode() {
            return -1707890478;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyl/f$K;", "Lyl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$K */
    public static final class K extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final K f170550h = new K();

        private K() {
            super("Enable New Address Qualifier UI", "Enabling this will allow the user to use the New Address qualifier UI. The user will be able to see new UI for the changing the Fulfillment method (address/store change) for both Pickup and Delivery flow.", "mma_enable_new_address_fulfillment_modal", false, null, 16, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$L;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$L */
    public static final /* data */ class L extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final L f170551h = new L();

        public boolean equals(Object other) {
            return this == other || (other instanceof L);
        }

        private L() {
            super("Enable New Barcode Scanner", "Enabling this will allow users to use the new barcode scan screens using google mlkit", null, false, null, 20, null);
        }

        public String toString() {
            return "NewBarcodeScan";
        }

        public int hashCode() {
            return 1950390386;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$M;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$M */
    public static final /* data */ class M extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final M f170552h = new M();

        public boolean equals(Object other) {
            return this == other || (other instanceof M);
        }

        private M() {
            super("Enable New Coupons List Page", "Enabling this will turn on New Coupons List Page", "mma_new_coupon_list_page_enabled", false, null, 16, null);
        }

        public String toString() {
            return "NewCouponListPage";
        }

        public int hashCode() {
            return 1250659614;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$N;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$N */
    public static final /* data */ class N extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final N f170553h = new N();

        public boolean equals(Object other) {
            return this == other || (other instanceof N);
        }

        private N() {
            super("Enable New Coupons Dashboard", "When enabled, you will see a new UI for the Coupons dashboard", "enable_coupons_dashboard", false, null, 16, null);
        }

        public String toString() {
            return "NewCouponsDashboard";
        }

        public int hashCode() {
            return 1165202386;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$O;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$O */
    public static final /* data */ class O extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final O f170554h = new O();

        public boolean equals(Object other) {
            return this == other || (other instanceof O);
        }

        private O() {
            super("Enable New Shopping List", "Enabling this will turn on the new shopping list.", "new_shopping_list_enabled", false, null, 16, null);
        }

        public String toString() {
            return "NewShoppingList";
        }

        public int hashCode() {
            return -733472911;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$P;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$P */
    public static final /* data */ class P extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final P f170555h = new P();

        public boolean equals(Object other) {
            return this == other || (other instanceof P);
        }

        private P() {
            super("Enable New Shopping List With Bottom Sheet", "Enabling this will turn on the new shopping list with bottom sheet if the New Shopping List feature flag is turned on.", null, false, O.f170554h, 4, null);
        }

        public String toString() {
            return "NewShoppingListWithBottomSheet";
        }

        public int hashCode() {
            return 1586234781;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$Q;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$Q */
    public static final /* data */ class Q extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final Q f170556h = new Q();

        public boolean equals(Object other) {
            return this == other || (other instanceof Q);
        }

        private Q() {
            super("Enable calling OMS endpoints for timeslot and timeslot verification", "When enabled, we will call the OMS endpoints for getting timeslots for all delivery orders and also verify timeslots. Pickup orders will continue to use Hybris for timeslots and timeslot verification.", "mma_enable_oms_timeslots_for_delivery", false, null, 16, null);
        }

        public String toString() {
            return "OmsTimeslotsForDelivery";
        }

        public int hashCode() {
            return 1646734773;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$R;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$R */
    public static final /* data */ class R extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final R f170557h = new R();

        public boolean equals(Object other) {
            return this == other || (other instanceof R);
        }

        private R() {
            super("Enable payment decoupling feature", "Enabling this will change how payment is processed to allow for later payment information correction", "payment_decoupling_enabled", false, null, 16, null);
        }

        public String toString() {
            return "PaymentDecoupling";
        }

        public int hashCode() {
            return 1265332079;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$S;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$S */
    public static final /* data */ class S extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final S f170558h = new S();

        public boolean equals(Object other) {
            return this == other || (other instanceof S);
        }

        private S() {
            super("Enable new deep link for personalized carousels", "When enabled, the personalized carousels will use the new deep link format", "personalized_products_upc_route_enabled", false, null, 16, null);
        }

        public String toString() {
            return "PersonalizedProductsNewDeepLink";
        }

        public int hashCode() {
            return -640944035;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$T;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$T */
    public static final /* data */ class T extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final T f170559h = new T();

        public boolean equals(Object other) {
            return this == other || (other instanceof T);
        }

        private T() {
            super("Enable new PLP to use Compose", "Switch to the Compose version of the PLP.", "plp_use_compose", false, null, 16, null);
        }

        public String toString() {
            return "PlpCompose";
        }

        public int hashCode() {
            return -7943533;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$U;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$U */
    public static final /* data */ class U extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final U f170560h = new U();

        public boolean equals(Object other) {
            return this == other || (other instanceof U);
        }

        private U() {
            super("Enable Post Order Complex Promos", "Enabling this will turn on Post Order Complex Promos", "enable_complex_promo_post_order", false, null, 16, null);
        }

        public String toString() {
            return "PostOrderComplexPromos";
        }

        public int hashCode() {
            return 1421959227;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$V;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$V */
    public static final /* data */ class V extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final V f170561h = new V();

        public boolean equals(Object other) {
            return this == other || (other instanceof V);
        }

        private V() {
            super("Prevent GM only home delivery orders", "Enabling this will prevent GM only home delivery orders from Grocery Only store", null, false, null, 20, null);
        }

        public String toString() {
            return "PreventGMOnlyHomeDelivery";
        }

        public int hashCode() {
            return 133955176;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$W;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$W */
    public static final /* data */ class W extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final W f170562h = new W();

        public boolean equals(Object other) {
            return this == other || (other instanceof W);
        }

        private W() {
            super("Use GraphQL data for the Product Detail Page (ProdX)", "Uses GraphQL endpoint to populate Product Details instead of Hybris.", "product_graphql_enabled", false, null, 16, null);
        }

        public String toString() {
            return "ProductDetailsGraphQL";
        }

        public int hashCode() {
            return -90782367;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$X;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$X */
    public static final /* data */ class X extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final X f170563h = new X();

        public boolean equals(Object other) {
            return this == other || (other instanceof X);
        }

        private X() {
            super("Enable PDP Product Recommendation", "Turn on to enable the PDP product recommendation feature", "pdp_product_recommendation_enabled", false, null, 16, null);
        }

        public String toString() {
            return "ProductRecommendation";
        }

        public int hashCode() {
            return -1531421229;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$Y;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$Y */
    public static final /* data */ class Y extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final Y f170564h = new Y();

        public boolean equals(Object other) {
            return this == other || (other instanceof Y);
        }

        private Y() {
            super("V2 Buy Again and Favs On Sale Endpoint Enabled For PLP", "Changes the product source API from v1 to v2.", "enable-buy-again-favs-on-sale-update-v2-endpoint", false, null, 16, null);
        }

        public String toString() {
            return "ProductRecommendationsV2";
        }

        public int hashCode() {
            return -1427101796;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyl/f$Z;", "Lyl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$Z */
    public static final class Z extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final Z f170565h = new Z();

        private Z() {
            super("Product Subscription", "Enabling this will display the complete subscription feature on Account and PDP Pages", null, false, null, 20, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$a;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$a, reason: case insensitive filesystem */
    public static final /* data */ class C18228a extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18228a f170566h = new C18228a();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18228a);
        }

        private C18228a() {
            super("Enable Account Overview Screen Alpha", "Enabling this feature flag, will take users to AccountOverviewScreenAlpha without Order Status and Your Meijer Store Cards instead of YourAccountActivity", "mma-accounts-overview-screen-alpha-enabled", false, null, 16, null);
        }

        public String toString() {
            return "AccountOverviewScreenAlpha";
        }

        public int hashCode() {
            return -1167075007;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyl/f$a0;", "Lyl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$a0 */
    public static final class a0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final a0 f170567h = new a0();

        private a0() {
            super("Enable Rokt Ad Display Confirmation Page", "Enabling this will display the Rokt ad on the order confirmation page.", "rokt_ad_display_confirmation_page_enabled", false, null, 16, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$b;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$b, reason: case insensitive filesystem */
    public static final /* data */ class C18229b extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18229b f170568h = new C18229b();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18229b);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private C18229b() {
            String str = "Enable Account Overview Screen Beta";
            String str2 = "Enabling this and AccountOverviewScreenAlpha feature flag, will take users to AccountOverviewScreenAlpha containing Order Status and Your Meijer Store Cards instead of YourAccountActivity";
            String str3 = "mma-accounts-overview-screen-beta-enabled";
            super(str, str2, str3, false, C18228a.f170566h, null);
        }

        public String toString() {
            return "AccountOverviewScreenBeta";
        }

        public int hashCode() {
            return -37624403;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyl/f$b0;", "Lyl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$b0 */
    public static final class b0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final b0 f170569h = new b0();

        private b0() {
            super("Enable New Search with GraphQL", "Replaces product search via Constructor.io new GraphQL Search engine", "graphql_search_enabled", false, null, 16, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$c;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$c, reason: case insensitive filesystem */
    public static final /* data */ class C18230c extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18230c f170570h = new C18230c();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18230c);
        }

        private C18230c() {
            super("Enable Accounts Services V2", "When enabled, we will call the new accounts endpoints", null, false, null, 20, null);
        }

        public String toString() {
            return "AccountsServicesV2";
        }

        public int hashCode() {
            return 1598510229;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$c0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$c0 */
    public static final /* data */ class c0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final c0 f170571h = new c0();

        public boolean equals(Object other) {
            return this == other || (other instanceof c0);
        }

        private c0() {
            super("Enable Seasonal Carousel", "Fetch details for and show seasonal carousel card", "seasonal_carousel_enabled", false, null, 16, null);
        }

        public String toString() {
            return "SeasonalCarousel";
        }

        public int hashCode() {
            return 2098686883;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$d;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$d, reason: case insensitive filesystem */
    public static final /* data */ class C18231d extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18231d f170572h = new C18231d();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18231d);
        }

        private C18231d() {
            super("Enable WIC for Accounts", "Enabling this will allow the user to manage their WIC card and see their available benefits in Accounts.", null, false, null, 20, null);
        }

        public String toString() {
            return "AccountsWic";
        }

        public int hashCode() {
            return 870656790;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$d0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$d0 */
    public static final /* data */ class d0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final d0 f170573h = new d0();

        public boolean equals(Object other) {
            return this == other || (other instanceof d0);
        }

        private d0() {
            super("Enable Shop & Scan Module", "Turn this off to prevent users from accessing Shop & Scan Module.", "shop_and_scan_available", true, null, 16, null);
        }

        public String toString() {
            return "ShopAndScanAvailable";
        }

        public int hashCode() {
            return 1198233248;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$e;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$e, reason: case insensitive filesystem */
    public static final /* data */ class C18232e extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18232e f170574h = new C18232e();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18232e);
        }

        private C18232e() {
            super("Batch Cart Modifications", "Enable new batch cart modification system instead of legacy add/remove/update APIs.", "batch_cart_modifications_UNPUBLISHED", false, null, 16, null);
        }

        public String toString() {
            return "BatchCartModifications";
        }

        public int hashCode() {
            return -304888558;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$e0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$e0 */
    public static final /* data */ class e0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final e0 f170575h = new e0();

        public boolean equals(Object other) {
            return this == other || (other instanceof e0);
        }

        private e0() {
            super("Enable 2-Minute AuthToken TTL", "Overwrite the expiration time for Okta Authentication Tokens from the standard length to 2 minutes.\n\nEnable for testing auto-logout flows, refresh token behaviors, and other authentication-related issues.\n\nYou will need to log in with a fresh session for this to take effect.", null, false, null, 20, null);
        }

        public String toString() {
            return "ShortenedAuthTokenTtl";
        }

        public int hashCode() {
            return 1174222314;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$f;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$f, reason: collision with other inner class name */
    public static final /* data */ class C2748f extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C2748f f170576h = new C2748f();

        public boolean equals(Object other) {
            return this == other || (other instanceof C2748f);
        }

        private C2748f() {
            super("Enable Product Review Feedback", "Whether to enable like,dislike and report functionality for product reviews", null, false, null, 20, null);
        }

        public String toString() {
            return "BazaarVoiceFeedbackEnabled";
        }

        public int hashCode() {
            return 2059181302;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$f0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$f0 */
    public static final /* data */ class f0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final f0 f170577h = new f0();

        public boolean equals(Object other) {
            return this == other || (other instanceof f0);
        }

        private f0() {
            super("Show credit card transaction history", "When enabled, will show the credit card transaction data on the order summary screen, if the data is available from BE.", "mma-enable-credit-card-transaction-history", false, null, 16, null);
        }

        public String toString() {
            return "ShowCreditCardTransactionHistory";
        }

        public int hashCode() {
            return -834351407;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$g;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$g, reason: case insensitive filesystem */
    public static final /* data */ class C18233g extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18233g f170578h = new C18233g();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18233g);
        }

        private C18233g() {
            super("Enable Bazaar Voice plp", "Enabling this will turn on BazaarVoice in plp for product reviews and ratings.", "enable_bazaarvoice_plp_mobile", false, null, 16, null);
        }

        public String toString() {
            return "BazaarVoicePlp";
        }

        public int hashCode() {
            return 77221358;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$g0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$g0 */
    public static final /* data */ class g0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final g0 f170579h = new g0();

        public boolean equals(Object other) {
            return this == other || (other instanceof g0);
        }

        private g0() {
            super("Show live gas prices", "Semi-permanent feature flag that allows us to show or hide live gas prices. This feature has been around for a long time, so the default is `true`, but management is considering removing them for business reasons.", "mma_show_fuel_prices", true, null, 16, null);
        }

        public String toString() {
            return "ShowLiveGasPrices";
        }

        public int hashCode() {
            return 1396960709;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyl/f$h;", "Lyl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$h, reason: case insensitive filesystem */
    public static final class C18234h extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18234h f170580h = new C18234h();

        private C18234h() {
            super("Enable Debug mode For Beacons", "Enables debug mode for testing and validating beacon functionality during development and QA.", null, false, null, 20, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyl/f$h0;", "Lyl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$h0 */
    public static final class h0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final h0 f170581h = new h0();

        private h0() {
            super("Enable Simplified Create Account Experience", "Enabling this will allow the user to reach the simplified create account screen.", null, false, null, 20, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$i;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$i, reason: case insensitive filesystem */
    public static final /* data */ class C18235i extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18235i f170582h = new C18235i();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18235i);
        }

        private C18235i() {
            super("Enable BOPAS Timeslots feature", "Turn on to enable the BOPAS Timeslots feature", "bopas-timeslots-feature", false, null, 16, null);
        }

        public String toString() {
            return "BopasTimeslotsFeature";
        }

        public int hashCode() {
            return -110395154;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$i0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$i0 */
    public static final /* data */ class i0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final i0 f170583h = new i0();

        public boolean equals(Object other) {
            return this == other || (other instanceof i0);
        }

        private i0() {
            super("Single Page Checkout", "Enables single page checkout experience", "mma-enable-single-page-checkout", false, null, 16, null);
        }

        public String toString() {
            return "SinglePageCheckout";
        }

        public int hashCode() {
            return 796142066;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$j;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$j, reason: case insensitive filesystem */
    public static final /* data */ class C18236j extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18236j f170584h = new C18236j();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18236j);
        }

        private C18236j() {
            super("Enable Browse Department Breadcrumbs", "Show breadcrumbs control on tier navigation department screens", "browse_department_breadcrumbs", false, null, 16, null);
        }

        public String toString() {
            return "BrowseDepartmentBreadcrumbs";
        }

        public int hashCode() {
            return -356990785;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$j0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$j0 */
    public static final /* data */ class j0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final j0 f170585h = new j0();

        public boolean equals(Object other) {
            return this == other || (other instanceof j0);
        }

        private j0() {
            super("Sort Fulfillment Options Ascending", "When enabled, the fulfillment partners will be sorted in ascending order, (eg Buncha before Shipt). When false, they will be sorted descending (eg Shipt before Buncha).", "mma_sort_buncha_first", false, null, 16, null);
        }

        public String toString() {
            return "SortFulfillmentOptionsAscending";
        }

        public int hashCode() {
            return -262187803;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$k;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$k, reason: case insensitive filesystem */
    public static final /* data */ class C18237k extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18237k f170586h = new C18237k();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18237k);
        }

        private C18237k() {
            super("Enable Buncha Fulfillment", "Enable Buncha fulfillment partner related features & UI like Delivery & timeslot selection for Buncha, Delivery Confirm api call, Order summary info related to Buncha", "enable_mma_buncha_address_qualification", false, null, 16, null);
        }

        public String toString() {
            return "BunchaFulfillment";
        }

        public int hashCode() {
            return 863173544;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$k0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$k0 */
    public static final /* data */ class k0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final k0 f170587h = new k0();

        public boolean equals(Object other) {
            return this == other || (other instanceof k0);
        }

        private k0() {
            super("Enable Sponsored Products For BuyAgain", "Allow sponsored products to show up in Buy Again Carousel in HomeScreen And Plp", "mma_buy_again_sponsored_products_enabled", false, null, 16, null);
        }

        public String toString() {
            return "SponsoredProductBuyAgain";
        }

        public int hashCode() {
            return 1309646053;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$l;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$l, reason: case insensitive filesystem */
    public static final /* data */ class C18238l extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18238l f170588h = new C18238l();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18238l);
        }

        private C18238l() {
            super("Enable ChatBot", "Enables ChatBot access via the navigation menu.", "mma_chatbot_enabled", false, null, 16, null);
        }

        public String toString() {
            return "ChatBot";
        }

        public int hashCode() {
            return -1510033958;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$l0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$l0 */
    public static final /* data */ class l0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final l0 f170589h = new l0();

        public boolean equals(Object other) {
            return this == other || (other instanceof l0);
        }

        private l0() {
            super("Enable Sponsored Products For Favorites On Sale", "Allow sponsored products to show up in Favorites On Sale Carousel in HomeScreen and PLP.", "mma_fos_sponsored_products_enabled", false, null, 16, null);
        }

        public String toString() {
            return "SponsoredProductFavOnSale";
        }

        public int hashCode() {
            return 552307382;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyl/f$m;", "Lyl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$m, reason: case insensitive filesystem */
    public static final class C18239m extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18239m f170590h = new C18239m();

        private C18239m() {
            super("Enable Collections GraphQL", "Enable sourcing Collections data from GraphQL", "GraphQL_for_collections_enabled", false, null, 16, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$n;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$n, reason: case insensitive filesystem */
    public static final /* data */ class C18240n extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18240n f170591h = new C18240n();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18240n);
        }

        private C18240n() {
            super("Compose Home Screen", "Enable new home screen written in Compose", null, false, null, 20, null);
        }

        public String toString() {
            return "ComposeHomeScreen";
        }

        public int hashCode() {
            return 355200552;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lyl/f$n0;", "", "", "a", "()Ljava/lang/String;", "defaultValue", "b", "localTestValue", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$n0 */
    public interface n0 {
        default String a() {
            return "";
        }

        default String b() {
            return "";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$o;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$o, reason: case insensitive filesystem */
    public static final /* data */ class C18241o extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18241o f170592h = new C18241o();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18241o);
        }

        private C18241o() {
            super("Use Compose PDP", "Use new version of PDP written in compose.", "mma_pdp_use_compose", false, null, 16, null);
        }

        public String toString() {
            return "ComposeProductDetails";
        }

        public int hashCode() {
            return 1762036688;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$o0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$o0 */
    public static final /* data */ class o0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final o0 f170593h = new o0();

        public boolean equals(Object other) {
            return this == other || (other instanceof o0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private o0() {
            String str = "Enable Teacher Lists home screen banner";
            String str2 = "Enables access to Teacher Lists via the navigation menu.";
            String str3 = "mma_enable_teacherlists_banner";
            super(str, str2, str3, false, p0.f170595h, null);
        }

        public String toString() {
            return "TeacherListsBanner";
        }

        public int hashCode() {
            return 224489076;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$p;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$p, reason: case insensitive filesystem */
    public static final /* data */ class C18242p extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18242p f170594h = new C18242p();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18242p);
        }

        private C18242p() {
            super("Sponsorship products for PDP", "Sponsorship products on the recommended products carrousel", "mma_enable_pdp_sponsored_product_experience", false, null, 16, null);
        }

        public String toString() {
            return "ComposeSponsorshipPDP";
        }

        public int hashCode() {
            return -130570685;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$p0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$p0 */
    public static final /* data */ class p0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final p0 f170595h = new p0();

        public boolean equals(Object other) {
            return this == other || (other instanceof p0);
        }

        private p0() {
            super("Enable Teacher Lists experience", "Enables access to Teacher Lists via the navigation menu.", "mma_enable_teachers_list", false, null, 16, null);
        }

        public String toString() {
            return "TeacherListsSeasonStatus";
        }

        public int hashCode() {
            return -909538819;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$q;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$q, reason: case insensitive filesystem */
    public static final /* data */ class C18243q extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18243q f170596h = new C18243q();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18243q);
        }

        private C18243q() {
            super("Enable Dark Mode", "Enabling this will allow dark mode in the entire application, using the system setting to determine if dark mode should be shown. Note that not every theme we use supports dark mode yet, and it is still in early development.", "dark_mode_enabled", false, null, 16, null);
        }

        public String toString() {
            return "DarkMode";
        }

        public int hashCode() {
            return 737550606;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$q0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$q0 */
    public static final /* data */ class q0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final q0 f170597h = new q0();

        public boolean equals(Object other) {
            return this == other || (other instanceof q0);
        }

        private q0() {
            super("Enable Redesigned Timeslot UI", "Enabling this will turn on the new timeslot selection screen.", "timeslot_redesign_android_enabled", false, null, 16, null);
        }

        public String toString() {
            return "TimeslotRedesign";
        }

        public int hashCode() {
            return 365928177;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0016"}, d2 = {"Lyl/f$r;", "Lyl/f;", "Lyl/f$G;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/launchdarkly/sdk/LDValue;", "a", "()Lcom/launchdarkly/sdk/LDValue;", "defaultValue", "b", "localTestValue", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$r, reason: case insensitive filesystem */
    public static final /* data */ class C18244r extends AbstractC18227f implements G {

        /* renamed from: h, reason: collision with root package name */
        public static final C18244r f170598h = new C18244r();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18244r);
        }

        private C18244r() {
            super("Delivery partners fee", "This is a temporary FF used so that the delivery fee for Buncha (and maybe other partners in the future) can be changed without recompiling the app. Once the backend can provide this, we will no longer need this flag.", "mma_delivery_partners_fee", false, null, 16, null);
        }

        @Override // yl.AbstractC18227f.G
        public String b() {
            return C18225d.f170533a.a();
        }

        public String toString() {
            return "DeliveryPricingInfo";
        }

        @Override // yl.AbstractC18227f.G
        public LDValue a() {
            LDValue lDValueU = LDValue.u();
            Intrinsics.i(lDValueU, "ofNull(...)");
            return lDValueU;
        }

        public int hashCode() {
            return -1841030389;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0016\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0017"}, d2 = {"Lyl/f$r0;", "Lyl/f;", "Lyl/f$n0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "a", "defaultValue", "j", "b", "localTestValue", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$r0 */
    public static final /* data */ class r0 extends AbstractC18227f implements n0 {

        /* renamed from: h, reason: collision with root package name */
        public static final r0 f170599h = new r0();

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final String defaultValue = "default";

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private static final String localTestValue = "holiday";

        public boolean equals(Object other) {
            return this == other || (other instanceof r0);
        }

        private r0() {
            super("Toggle App Launcher Icon", "Toggling this will trigger a change to an current app launcher icon after the user next leaves the app. Enabling locally will set it to the Winter Holidays icon, while disabling will enable the default icon. Remote will always use the LaunchDarkly value.", "mma-current-app-icon", false, null, 16, null);
        }

        @Override // yl.AbstractC18227f.n0
        public String a() {
            return defaultValue;
        }

        @Override // yl.AbstractC18227f.n0
        public String b() {
            return localTestValue;
        }

        public String toString() {
            return "ToggleAlternateLauncherIcon";
        }

        public int hashCode() {
            return 1678818794;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyl/f$s;", "Lyl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$s, reason: case insensitive filesystem */
    public static final class C18245s extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18245s f170602h = new C18245s();

        private C18245s() {
            super("Enable Departments GraphQL", "Enable sourcing Departments data from GraphQL", "GraphQL_for_departments_enabled", false, null, 16, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$s0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$s0 */
    public static final /* data */ class s0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final s0 f170603h = new s0();

        public boolean equals(Object other) {
            return this == other || (other instanceof s0);
        }

        private s0() {
            super("Multi-UPC (GraphQL vs Constructor)", "Toggle between powering multi-upc call with GraphQL or Constructor", "multi_product_graphql_enabled", false, null, 16, null);
        }

        public String toString() {
            return "UseGraphQLForMultiUPC";
        }

        public int hashCode() {
            return 815501985;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$t;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$t, reason: case insensitive filesystem */
    public static final /* data */ class C18246t extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18246t f170604h = new C18246t();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18246t);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private C18246t() {
            String str = "Enable Product Variants on Product Details Page (ProdX)";
            String str2 = "Shows product variants on PDP if they are available. Requires Compose PDP.";
            String str3 = "product_variants_enabled";
            super(str, str2, str3, false, C18241o.f170592h, null);
        }

        public String toString() {
            return "DisplayProductVariants";
        }

        public int hashCode() {
            return 2105781136;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$t0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$t0 */
    public static final /* data */ class t0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final t0 f170605h = new t0();

        public boolean equals(Object other) {
            return this == other || (other instanceof t0);
        }

        private t0() {
            super("Enable new search refactor screen", "Toggles between the current search screen and the new one that is completely in Compose", null, false, null, 20, null);
        }

        public String toString() {
            return "UseNewSearchScreen";
        }

        public int hashCode() {
            return -659784190;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$u;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$u, reason: case insensitive filesystem */
    public static final /* data */ class C18247u extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18247u f170606h = new C18247u();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18247u);
        }

        private C18247u() {
            super("Dynamic timeslot management (DTM) timeslots enabled", "When enabled, we will call the new endpoints for timeslots for pickup orders. This will allows the backend to do dynamic timeslot management in the future.", "dtm-pickup-timeslots-enabled", false, null, 16, null);
        }

        public String toString() {
            return "DtmEnableNewTimeSlots";
        }

        public int hashCode() {
            return 609884883;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$u0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$u0 */
    public static final /* data */ class u0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final u0 f170607h = new u0();

        public boolean equals(Object other) {
            return this == other || (other instanceof u0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private u0() {
            String str = "Enable Predictable Logic for Home Cards";
            String str2 = "When enabled, the home cards will use the new predictable logic API (Get Cards Layout)";
            String str3 = "server_driven_home_enabled";
            super(str, str2, str3, false, C18240n.f170591h, null);
        }

        public String toString() {
            return "UsePredictableLogicForHomeCards";
        }

        public int hashCode() {
            return 1775424184;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$v;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$v, reason: case insensitive filesystem */
    public static final /* data */ class C18248v extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18248v f170608h = new C18248v();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18248v);
        }

        private C18248v() {
            super("Surcharge Included With Total Price", "When enabled, MMA must add the EBT surcharge to the Total Price With Tax fields for Checkout, Order Confirmation, and Order Details.", "mma_include_overages_to_total_price", false, null, 16, null);
        }

        public String toString() {
            return "EBTAddSurchargeToTotalPrice";
        }

        public int hashCode() {
            return 1663076325;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lyl/f$v0;", "Lyl/f;", "Lyl/f$G;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "localTestValue", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$v0 */
    public static final /* data */ class v0 extends AbstractC18227f implements G {

        /* renamed from: h, reason: collision with root package name */
        public static final v0 f170609h = new v0();

        public boolean equals(Object other) {
            return this == other || (other instanceof v0);
        }

        private v0() {
            super("", "", "app-version-update-config", false, null, 16, null);
        }

        @Override // yl.AbstractC18227f.G
        public String b() {
            return C18224c.f170531a.a();
        }

        public String toString() {
            return "VersionUpdateConfig";
        }

        public int hashCode() {
            return -1755986834;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$w;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$w, reason: case insensitive filesystem */
    public static final /* data */ class C18249w extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18249w f170610h = new C18249w();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18249w);
        }

        private C18249w() {
            super("Bypass Check Balance Limit", "When enabled, the limit placed on the number of times the user can check their EBT balance will be ignored.", "bypass_check_balance_limit", false, null, 16, null);
        }

        public String toString() {
            return "EBTBypassCheckBalanceLimit";
        }

        public int hashCode() {
            return -797088387;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$w0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$w0 */
    public static final /* data */ class w0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final w0 f170611h = new w0();

        public boolean equals(Object other) {
            return this == other || (other instanceof w0);
        }

        private w0() {
            super("White Label Carousel", "Show or hide white label carousel", "white_label_carousel_enabled", false, null, 16, null);
        }

        public String toString() {
            return "WhiteLabelCarousel";
        }

        public int hashCode() {
            return -2096191648;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$x;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$x, reason: case insensitive filesystem */
    public static final /* data */ class C18250x extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18250x f170612h = new C18250x();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18250x);
        }

        private C18250x() {
            super("Enable 3PM Mirakl", "Enabling this will source PLP tiles and PDP details from the thirdPartyProductOffer attributes in GraphQL.", "mma_enable_3pm_mirakl", false, null, 16, null);
        }

        public String toString() {
            return "Enable3pmMirakl";
        }

        public int hashCode() {
            return -1604331932;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$x0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$x0 */
    public static final /* data */ class x0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final x0 f170613h = new x0();

        public boolean equals(Object other) {
            return this == other || (other instanceof x0);
        }

        private x0() {
            super("White Label Carousel, View All", "Show or hide \"View All\" button for white label carousel", null, false, null, 20, null);
        }

        public String toString() {
            return "WhiteLabelCarouselViewAll";
        }

        public int hashCode() {
            return -399282884;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyl/f$y;", "Lyl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$y, reason: case insensitive filesystem */
    public static final class C18251y extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18251y f170614h = new C18251y();

        private C18251y() {
            super("Enable Video Ad Experience", "Enabling this will activate the video ad experience in Search and PLP pages.", null, false, null, 20, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$y0;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$y0 */
    public static final /* data */ class y0 extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final y0 f170615h = new y0();

        public boolean equals(Object other) {
            return this == other || (other instanceof y0);
        }

        private y0() {
            super("Enable WIC", "Enabling this will allow the user to use the WIC feature in the app", "mma_enable_wic", false, null, 16, null);
        }

        public String toString() {
            return "Wic";
        }

        public int hashCode() {
            return -647500836;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyl/f$z;", "Lyl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$z, reason: case insensitive filesystem */
    public static final /* data */ class C18252z extends AbstractC18227f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18252z f170616h = new C18252z();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18252z);
        }

        private C18252z() {
            super("Enable EZCD", "Enabling this will allow the Extended Zip Code Delivery", "enable_ezcd", false, null, 16, null);
        }

        public String toString() {
            return "ExtendedZipCodeDelivery";
        }

        public int hashCode() {
            return -1611058988;
        }
    }

    public /* synthetic */ AbstractC18227f(String str, String str2, String str3, boolean z10, AbstractC18227f abstractC18227f, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z10, abstractC18227f);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lyl/f$m0;", "", "", "", "a", "()Ljava/util/List;", "defaultValue", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.f$m0 */
    public interface m0 {
        default List<String> a() {
            return CollectionsKt.m();
        }
    }

    private AbstractC18227f(String str, String str2, String str3, boolean z10, AbstractC18227f abstractC18227f) {
        this.title = str;
        this.description = str2;
        this.remoteId = str3;
        this.default = z10;
        this.prerequisite = abstractC18227f;
        String strT = Reflection.b(getClass()).t();
        this.internalId = strT;
        this.shortName = strT != null ? StringsKt.o1(strT, ".", null, 2, null) : null;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getDefault() {
        return this.default;
    }

    /* renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: e, reason: from getter */
    public final String getInternalId() {
        return this.internalId;
    }

    /* renamed from: f, reason: from getter */
    public AbstractC18227f getPrerequisite() {
        return this.prerequisite;
    }

    /* renamed from: g, reason: from getter */
    public final String getRemoteId() {
        return this.remoteId;
    }

    /* renamed from: h, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ AbstractC18227f(String str, String str2, String str3, boolean z10, AbstractC18227f abstractC18227f, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : abstractC18227f, null);
    }
}
