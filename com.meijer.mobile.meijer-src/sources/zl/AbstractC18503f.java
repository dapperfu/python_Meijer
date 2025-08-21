package zl;

import com.launchdarkly.sdk.LDValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000¾\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bX\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:M\u001c\u001d\u001e\u001f !\"#$\u001a%&'()*+,-./\u00150123456\u000b\u000f789\u0012\r:;<=\u0011>?@ABCDEFGHI\u0017JKLMNOPQRSTUV\u0010WXYZ\u0013[\\]^B?\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0011\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u001a\u0010\u000e\u0082\u0001q_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0006¨\u0001"}, d2 = {"Lzl/f;", "", "", "title", "description", "remoteId", "", "default", "prerequisite", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLzl/f;)V", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "b", "d", "c", "g", "Z", "()Z", "e", "Lzl/f;", "f", "()Lzl/f;", "internalId", "h", "shortName", "n0", "E", "m0", "G", "v0", "r", "r0", "q", "e0", "F", "j", "d0", "D", "B", "g0", "A", "T", "t0", "S", "u0", "H", "J", "I", "N", "X", "U", "O", "P", "M", "C", "q0", "Y", "c0", "v", "u", "f0", "w", "R", "p", "o", "W", "w0", "s0", "x0", "t", "i0", "Q", "n", "z", "V", "l", "p0", "o0", "k0", "l0", "k", "j0", "L", "y0", "K", "b0", "m", "s", "y", "h0", "a0", "x", "Lzl/f$a;", "Lzl/f$b;", "Lzl/f$c;", "Lzl/f$d;", "Lzl/f$e;", "Lzl/f$f;", "Lzl/f$g;", "Lzl/f$h;", "Lzl/f$i;", "Lzl/f$j;", "Lzl/f$k;", "Lzl/f$l;", "Lzl/f$m;", "Lzl/f$n;", "Lzl/f$o;", "Lzl/f$p;", "Lzl/f$q;", "Lzl/f$r;", "Lzl/f$s;", "Lzl/f$t;", "Lzl/f$u;", "Lzl/f$v;", "Lzl/f$w;", "Lzl/f$x;", "Lzl/f$y;", "Lzl/f$z;", "Lzl/f$A;", "Lzl/f$B;", "Lzl/f$C;", "Lzl/f$D;", "Lzl/f$F;", "Lzl/f$H;", "Lzl/f$I;", "Lzl/f$J;", "Lzl/f$K;", "Lzl/f$L;", "Lzl/f$M;", "Lzl/f$N;", "Lzl/f$O;", "Lzl/f$P;", "Lzl/f$Q;", "Lzl/f$R;", "Lzl/f$S;", "Lzl/f$T;", "Lzl/f$U;", "Lzl/f$V;", "Lzl/f$W;", "Lzl/f$X;", "Lzl/f$Y;", "Lzl/f$Z;", "Lzl/f$a0;", "Lzl/f$b0;", "Lzl/f$c0;", "Lzl/f$d0;", "Lzl/f$e0;", "Lzl/f$f0;", "Lzl/f$g0;", "Lzl/f$h0;", "Lzl/f$i0;", "Lzl/f$j0;", "Lzl/f$k0;", "Lzl/f$l0;", "Lzl/f$o0;", "Lzl/f$p0;", "Lzl/f$q0;", "Lzl/f$r0;", "Lzl/f$s0;", "Lzl/f$t0;", "Lzl/f$u0;", "Lzl/f$v0;", "Lzl/f$w0;", "Lzl/f$x0;", "Lzl/f$y0;", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zl.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC18503f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String remoteId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean default;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC18503f prerequisite;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String internalId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String shortName;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$A;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$A */
    public static final /* data */ class A extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final A f172842h = new A();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$B;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$B */
    public static final /* data */ class B extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final B f172843h = new B();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$C;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$C */
    public static final /* data */ class C extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C f172844h = new C();

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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lzl/f$D;", "Lzl/f;", "Lzl/f$m0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$D */
    public static final /* data */ class D extends AbstractC18503f implements m0 {

        /* renamed from: h, reason: collision with root package name */
        public static final D f172845h = new D();

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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lzl/f$E;", "", "", "a", "()I", "intValue", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$E */
    public interface E {
        int a();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$F;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$F */
    public static final /* data */ class F extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final F f172846h = new F();

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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lzl/f$G;", "", "", "b", "()Ljava/lang/String;", "localTestValue", "Lcom/launchdarkly/sdk/LDValue;", "a", "()Lcom/launchdarkly/sdk/LDValue;", "defaultValue", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$G */
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$H;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$H */
    public static final /* data */ class H extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final H f172847h = new H();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$I;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$I */
    public static final /* data */ class I extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final I f172848h = new I();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$J;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$J */
    public static final /* data */ class J extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final J f172849h = new J();

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzl/f$K;", "Lzl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$K */
    public static final class K extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final K f172850h = new K();

        private K() {
            super("Enable New Address Qualifier UI", "Enabling this will allow the user to use the New Address qualifier UI. The user will be able to see new UI for the changing the Fulfillment method (address/store change) for both Pickup and Delivery flow.", "mma_enable_new_address_fulfillment_modal", false, null, 16, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$L;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$L */
    public static final /* data */ class L extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final L f172851h = new L();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$M;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$M */
    public static final /* data */ class M extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final M f172852h = new M();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$N;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$N */
    public static final /* data */ class N extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final N f172853h = new N();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$O;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$O */
    public static final /* data */ class O extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final O f172854h = new O();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$P;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$P */
    public static final /* data */ class P extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final P f172855h = new P();

        public boolean equals(Object other) {
            return this == other || (other instanceof P);
        }

        private P() {
            super("Enable New Shopping List With Bottom Sheet", "Enabling this will turn on the new shopping list with bottom sheet if the New Shopping List feature flag is turned on.", null, false, O.f172854h, 4, null);
        }

        public String toString() {
            return "NewShoppingListWithBottomSheet";
        }

        public int hashCode() {
            return 1586234781;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$Q;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$Q */
    public static final /* data */ class Q extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final Q f172856h = new Q();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$R;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$R */
    public static final /* data */ class R extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final R f172857h = new R();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$S;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$S */
    public static final /* data */ class S extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final S f172858h = new S();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$T;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$T */
    public static final /* data */ class T extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final T f172859h = new T();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$U;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$U */
    public static final /* data */ class U extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final U f172860h = new U();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$V;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$V */
    public static final /* data */ class V extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final V f172861h = new V();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$W;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$W */
    public static final /* data */ class W extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final W f172862h = new W();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$X;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$X */
    public static final /* data */ class X extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final X f172863h = new X();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$Y;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$Y */
    public static final /* data */ class Y extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final Y f172864h = new Y();

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzl/f$Z;", "Lzl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$Z */
    public static final class Z extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final Z f172865h = new Z();

        private Z() {
            super("Product Subscription", "Enabling this will display the complete subscription feature on Account and PDP Pages", null, false, null, 20, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$a;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$a, reason: case insensitive filesystem */
    public static final /* data */ class C18504a extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18504a f172866h = new C18504a();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18504a);
        }

        private C18504a() {
            super("Enable Account Overview Screen Alpha", "Enabling this feature flag, will take users to AccountOverviewScreenAlpha without Order Status and Your Meijer Store Cards instead of YourAccountActivity", "mma-accounts-overview-screen-alpha-enabled", false, null, 16, null);
        }

        public String toString() {
            return "AccountOverviewScreenAlpha";
        }

        public int hashCode() {
            return -1167075007;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzl/f$a0;", "Lzl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$a0 */
    public static final class a0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final a0 f172867h = new a0();

        private a0() {
            super("Enable Rokt Ad Display Confirmation Page", "Enabling this will display the Rokt ad on the order confirmation page.", "rokt_ad_display_confirmation_page_enabled", false, null, 16, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$b;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$b, reason: case insensitive filesystem */
    public static final /* data */ class C18505b extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18505b f172868h = new C18505b();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18505b);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private C18505b() {
            String str = "Enable Account Overview Screen Beta";
            String str2 = "Enabling this and AccountOverviewScreenAlpha feature flag, will take users to AccountOverviewScreenAlpha containing Order Status and Your Meijer Store Cards instead of YourAccountActivity";
            String str3 = "mma-accounts-overview-screen-beta-enabled";
            super(str, str2, str3, false, C18504a.f172866h, null);
        }

        public String toString() {
            return "AccountOverviewScreenBeta";
        }

        public int hashCode() {
            return -37624403;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzl/f$b0;", "Lzl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$b0 */
    public static final class b0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final b0 f172869h = new b0();

        private b0() {
            super("Enable New Search with GraphQL", "Replaces product search via Constructor.io new GraphQL Search engine", "graphql_search_enabled", false, null, 16, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$c;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$c, reason: case insensitive filesystem */
    public static final /* data */ class C18506c extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18506c f172870h = new C18506c();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18506c);
        }

        private C18506c() {
            super("Enable Accounts Services V2", "When enabled, we will call the new accounts endpoints", null, false, null, 20, null);
        }

        public String toString() {
            return "AccountsServicesV2";
        }

        public int hashCode() {
            return 1598510229;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$c0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$c0 */
    public static final /* data */ class c0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final c0 f172871h = new c0();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$d;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$d, reason: case insensitive filesystem */
    public static final /* data */ class C18507d extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18507d f172872h = new C18507d();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18507d);
        }

        private C18507d() {
            super("Enable WIC for Accounts", "Enabling this will allow the user to manage their WIC card and see their available benefits in Accounts.", null, false, null, 20, null);
        }

        public String toString() {
            return "AccountsWic";
        }

        public int hashCode() {
            return 870656790;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$d0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$d0 */
    public static final /* data */ class d0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final d0 f172873h = new d0();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$e;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$e, reason: case insensitive filesystem */
    public static final /* data */ class C18508e extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18508e f172874h = new C18508e();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18508e);
        }

        private C18508e() {
            super("Batch Cart Modifications", "Enable new batch cart modification system instead of legacy add/remove/update APIs.", "batch_cart_modifications_UNPUBLISHED", false, null, 16, null);
        }

        public String toString() {
            return "BatchCartModifications";
        }

        public int hashCode() {
            return -304888558;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$e0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$e0 */
    public static final /* data */ class e0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final e0 f172875h = new e0();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$f;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$f, reason: collision with other inner class name */
    public static final /* data */ class C2788f extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C2788f f172876h = new C2788f();

        public boolean equals(Object other) {
            return this == other || (other instanceof C2788f);
        }

        private C2788f() {
            super("Enable Product Review Feedback", "Whether to enable like,dislike and report functionality for product reviews", null, false, null, 20, null);
        }

        public String toString() {
            return "BazaarVoiceFeedbackEnabled";
        }

        public int hashCode() {
            return 2059181302;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$f0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$f0 */
    public static final /* data */ class f0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final f0 f172877h = new f0();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$g;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$g, reason: case insensitive filesystem */
    public static final /* data */ class C18509g extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18509g f172878h = new C18509g();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18509g);
        }

        private C18509g() {
            super("Enable Bazaar Voice plp", "Enabling this will turn on BazaarVoice in plp for product reviews and ratings.", "enable_bazaarvoice_plp_mobile", false, null, 16, null);
        }

        public String toString() {
            return "BazaarVoicePlp";
        }

        public int hashCode() {
            return 77221358;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$g0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$g0 */
    public static final /* data */ class g0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final g0 f172879h = new g0();

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzl/f$h;", "Lzl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$h, reason: case insensitive filesystem */
    public static final class C18510h extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18510h f172880h = new C18510h();

        private C18510h() {
            super("Enable Debug mode For Beacons", "Enables debug mode for testing and validating beacon functionality during development and QA.", null, false, null, 20, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzl/f$h0;", "Lzl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$h0 */
    public static final class h0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final h0 f172881h = new h0();

        private h0() {
            super("Enable Simplified Create Account Experience", "Enabling this will allow the user to reach the simplified create account screen.", null, false, null, 20, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$i;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$i, reason: case insensitive filesystem */
    public static final /* data */ class C18511i extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18511i f172882h = new C18511i();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18511i);
        }

        private C18511i() {
            super("Enable BOPAS Timeslots feature", "Turn on to enable the BOPAS Timeslots feature", "bopas-timeslots-feature", false, null, 16, null);
        }

        public String toString() {
            return "BopasTimeslotsFeature";
        }

        public int hashCode() {
            return -110395154;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$i0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$i0 */
    public static final /* data */ class i0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final i0 f172883h = new i0();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$j;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$j, reason: case insensitive filesystem */
    public static final /* data */ class C18512j extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18512j f172884h = new C18512j();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18512j);
        }

        private C18512j() {
            super("Enable Browse Department Breadcrumbs", "Show breadcrumbs control on tier navigation department screens", "browse_department_breadcrumbs", false, null, 16, null);
        }

        public String toString() {
            return "BrowseDepartmentBreadcrumbs";
        }

        public int hashCode() {
            return -356990785;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$j0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$j0 */
    public static final /* data */ class j0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final j0 f172885h = new j0();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$k;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$k, reason: case insensitive filesystem */
    public static final /* data */ class C18513k extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18513k f172886h = new C18513k();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18513k);
        }

        private C18513k() {
            super("Enable Buncha Fulfillment", "Enable Buncha fulfillment partner related features & UI like Delivery & timeslot selection for Buncha, Delivery Confirm api call, Order summary info related to Buncha", "enable_mma_buncha_address_qualification", false, null, 16, null);
        }

        public String toString() {
            return "BunchaFulfillment";
        }

        public int hashCode() {
            return 863173544;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$k0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$k0 */
    public static final /* data */ class k0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final k0 f172887h = new k0();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$l;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$l, reason: case insensitive filesystem */
    public static final /* data */ class C18514l extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18514l f172888h = new C18514l();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18514l);
        }

        private C18514l() {
            super("Enable ChatBot", "Enables ChatBot access via the navigation menu.", "mma_chatbot_enabled", false, null, 16, null);
        }

        public String toString() {
            return "ChatBot";
        }

        public int hashCode() {
            return -1510033958;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$l0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$l0 */
    public static final /* data */ class l0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final l0 f172889h = new l0();

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzl/f$m;", "Lzl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$m, reason: case insensitive filesystem */
    public static final class C18515m extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18515m f172890h = new C18515m();

        private C18515m() {
            super("Enable Collections GraphQL", "Enable sourcing Collections data from GraphQL", "GraphQL_for_collections_enabled", false, null, 16, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$n;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$n, reason: case insensitive filesystem */
    public static final /* data */ class C18516n extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18516n f172891h = new C18516n();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18516n);
        }

        private C18516n() {
            super("Compose Home Screen", "Enable new home screen written in Compose", null, false, null, 20, null);
        }

        public String toString() {
            return "ComposeHomeScreen";
        }

        public int hashCode() {
            return 355200552;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lzl/f$n0;", "", "", "a", "()Ljava/lang/String;", "defaultValue", "b", "localTestValue", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$n0 */
    public interface n0 {
        default String a() {
            return "";
        }

        default String b() {
            return "";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$o;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$o, reason: case insensitive filesystem */
    public static final /* data */ class C18517o extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18517o f172892h = new C18517o();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18517o);
        }

        private C18517o() {
            super("Use Compose PDP", "Use new version of PDP written in compose.", "mma_pdp_use_compose", false, null, 16, null);
        }

        public String toString() {
            return "ComposeProductDetails";
        }

        public int hashCode() {
            return 1762036688;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$o0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$o0 */
    public static final /* data */ class o0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final o0 f172893h = new o0();

        public boolean equals(Object other) {
            return this == other || (other instanceof o0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private o0() {
            String str = "Enable Teacher Lists home screen banner";
            String str2 = "Enables access to Teacher Lists via the navigation menu.";
            String str3 = "mma_enable_teacherlists_banner";
            super(str, str2, str3, false, p0.f172895h, null);
        }

        public String toString() {
            return "TeacherListsBanner";
        }

        public int hashCode() {
            return 224489076;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$p;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$p, reason: case insensitive filesystem */
    public static final /* data */ class C18518p extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18518p f172894h = new C18518p();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18518p);
        }

        private C18518p() {
            super("Sponsorship products for PDP", "Sponsorship products on the recommended products carrousel", "mma_enable_pdp_sponsored_product_experience", false, null, 16, null);
        }

        public String toString() {
            return "ComposeSponsorshipPDP";
        }

        public int hashCode() {
            return -130570685;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$p0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$p0 */
    public static final /* data */ class p0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final p0 f172895h = new p0();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$q;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$q, reason: case insensitive filesystem */
    public static final /* data */ class C18519q extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18519q f172896h = new C18519q();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18519q);
        }

        private C18519q() {
            super("Enable Dark Mode", "Enabling this will allow dark mode in the entire application, using the system setting to determine if dark mode should be shown. Note that not every theme we use supports dark mode yet, and it is still in early development.", "dark_mode_enabled", false, null, 16, null);
        }

        public String toString() {
            return "DarkMode";
        }

        public int hashCode() {
            return 737550606;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$q0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$q0 */
    public static final /* data */ class q0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final q0 f172897h = new q0();

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

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0016"}, d2 = {"Lzl/f$r;", "Lzl/f;", "Lzl/f$G;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/launchdarkly/sdk/LDValue;", "a", "()Lcom/launchdarkly/sdk/LDValue;", "defaultValue", "b", "localTestValue", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$r, reason: case insensitive filesystem */
    public static final /* data */ class C18520r extends AbstractC18503f implements G {

        /* renamed from: h, reason: collision with root package name */
        public static final C18520r f172898h = new C18520r();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18520r);
        }

        private C18520r() {
            super("Delivery partners fee", "This is a temporary FF used so that the delivery fee for Buncha (and maybe other partners in the future) can be changed without recompiling the app. Once the backend can provide this, we will no longer need this flag.", "mma_delivery_partners_fee", false, null, 16, null);
        }

        @Override // zl.AbstractC18503f.G
        public String b() {
            return C18501d.f172833a.a();
        }

        public String toString() {
            return "DeliveryPricingInfo";
        }

        @Override // zl.AbstractC18503f.G
        public LDValue a() {
            LDValue lDValueU = LDValue.u();
            Intrinsics.i(lDValueU, "ofNull(...)");
            return lDValueU;
        }

        public int hashCode() {
            return -1841030389;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0016\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0017"}, d2 = {"Lzl/f$r0;", "Lzl/f;", "Lzl/f$n0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i", "Ljava/lang/String;", "a", "defaultValue", "j", "b", "localTestValue", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$r0 */
    public static final /* data */ class r0 extends AbstractC18503f implements n0 {

        /* renamed from: h, reason: collision with root package name */
        public static final r0 f172899h = new r0();

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

        @Override // zl.AbstractC18503f.n0
        public String a() {
            return defaultValue;
        }

        @Override // zl.AbstractC18503f.n0
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzl/f$s;", "Lzl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$s, reason: case insensitive filesystem */
    public static final class C18521s extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18521s f172902h = new C18521s();

        private C18521s() {
            super("Enable Departments GraphQL", "Enable sourcing Departments data from GraphQL", "GraphQL_for_departments_enabled", false, null, 16, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$s0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$s0 */
    public static final /* data */ class s0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final s0 f172903h = new s0();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$t;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$t, reason: case insensitive filesystem */
    public static final /* data */ class C18522t extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18522t f172904h = new C18522t();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18522t);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private C18522t() {
            String str = "Enable Product Variants on Product Details Page (ProdX)";
            String str2 = "Shows product variants on PDP if they are available. Requires Compose PDP.";
            String str3 = "product_variants_enabled";
            super(str, str2, str3, false, C18517o.f172892h, null);
        }

        public String toString() {
            return "DisplayProductVariants";
        }

        public int hashCode() {
            return 2105781136;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$t0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$t0 */
    public static final /* data */ class t0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final t0 f172905h = new t0();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$u;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$u, reason: case insensitive filesystem */
    public static final /* data */ class C18523u extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18523u f172906h = new C18523u();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18523u);
        }

        private C18523u() {
            super("Dynamic timeslot management (DTM) timeslots enabled", "When enabled, we will call the new endpoints for timeslots for pickup orders. This will allows the backend to do dynamic timeslot management in the future.", "dtm-pickup-timeslots-enabled", false, null, 16, null);
        }

        public String toString() {
            return "DtmEnableNewTimeSlots";
        }

        public int hashCode() {
            return 609884883;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$u0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$u0 */
    public static final /* data */ class u0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final u0 f172907h = new u0();

        public boolean equals(Object other) {
            return this == other || (other instanceof u0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private u0() {
            String str = "Enable Predictable Logic for Home Cards";
            String str2 = "When enabled, the home cards will use the new predictable logic API (Get Cards Layout)";
            String str3 = "server_driven_home_enabled";
            super(str, str2, str3, false, C18516n.f172891h, null);
        }

        public String toString() {
            return "UsePredictableLogicForHomeCards";
        }

        public int hashCode() {
            return 1775424184;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$v;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$v, reason: case insensitive filesystem */
    public static final /* data */ class C18524v extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18524v f172908h = new C18524v();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18524v);
        }

        private C18524v() {
            super("Surcharge Included With Total Price", "When enabled, MMA must add the EBT surcharge to the Total Price With Tax fields for Checkout, Order Confirmation, and Order Details.", "mma_include_overages_to_total_price", false, null, 16, null);
        }

        public String toString() {
            return "EBTAddSurchargeToTotalPrice";
        }

        public int hashCode() {
            return 1663076325;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzl/f$v0;", "Lzl/f;", "Lzl/f$G;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "localTestValue", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$v0 */
    public static final /* data */ class v0 extends AbstractC18503f implements G {

        /* renamed from: h, reason: collision with root package name */
        public static final v0 f172909h = new v0();

        public boolean equals(Object other) {
            return this == other || (other instanceof v0);
        }

        private v0() {
            super("", "", "app-version-update-config", false, null, 16, null);
        }

        @Override // zl.AbstractC18503f.G
        public String b() {
            return C18500c.f172831a.a();
        }

        public String toString() {
            return "VersionUpdateConfig";
        }

        public int hashCode() {
            return -1755986834;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$w;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$w, reason: case insensitive filesystem */
    public static final /* data */ class C18525w extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18525w f172910h = new C18525w();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18525w);
        }

        private C18525w() {
            super("Bypass Check Balance Limit", "When enabled, the limit placed on the number of times the user can check their EBT balance will be ignored.", "bypass_check_balance_limit", false, null, 16, null);
        }

        public String toString() {
            return "EBTBypassCheckBalanceLimit";
        }

        public int hashCode() {
            return -797088387;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$w0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$w0 */
    public static final /* data */ class w0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final w0 f172911h = new w0();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$x;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$x, reason: case insensitive filesystem */
    public static final /* data */ class C18526x extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18526x f172912h = new C18526x();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18526x);
        }

        private C18526x() {
            super("Enable 3PM Mirakl", "Enabling this will source PLP tiles and PDP details from the thirdPartyProductOffer attributes in GraphQL.", "mma_enable_3pm_mirakl", false, null, 16, null);
        }

        public String toString() {
            return "Enable3pmMirakl";
        }

        public int hashCode() {
            return -1604331932;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$x0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$x0 */
    public static final /* data */ class x0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final x0 f172913h = new x0();

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzl/f$y;", "Lzl/f;", "<init>", "()V", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$y, reason: case insensitive filesystem */
    public static final class C18527y extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18527y f172914h = new C18527y();

        private C18527y() {
            super("Enable Video Ad Experience", "Enabling this will activate the video ad experience in Search and PLP pages.", null, false, null, 20, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$y0;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$y0 */
    public static final /* data */ class y0 extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final y0 f172915h = new y0();

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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzl/f$z;", "Lzl/f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$z, reason: case insensitive filesystem */
    public static final /* data */ class C18528z extends AbstractC18503f {

        /* renamed from: h, reason: collision with root package name */
        public static final C18528z f172916h = new C18528z();

        public boolean equals(Object other) {
            return this == other || (other instanceof C18528z);
        }

        private C18528z() {
            super("Enable EZCD", "Enabling this will allow the Extended Zip Code Delivery", "enable_ezcd", false, null, 16, null);
        }

        public String toString() {
            return "ExtendedZipCodeDelivery";
        }

        public int hashCode() {
            return -1611058988;
        }
    }

    public /* synthetic */ AbstractC18503f(String str, String str2, String str3, boolean z10, AbstractC18503f abstractC18503f, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z10, abstractC18503f);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lzl/f$m0;", "", "", "", "a", "()Ljava/util/List;", "defaultValue", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zl.f$m0 */
    public interface m0 {
        default List<String> a() {
            return CollectionsKt.m();
        }
    }

    private AbstractC18503f(String str, String str2, String str3, boolean z10, AbstractC18503f abstractC18503f) {
        this.title = str;
        this.description = str2;
        this.remoteId = str3;
        this.default = z10;
        this.prerequisite = abstractC18503f;
        String strT = Reflection.b(getClass()).t();
        this.internalId = strT;
        this.shortName = strT != null ? StringsKt.s1(strT, ".", null, 2, null) : null;
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
    public AbstractC18503f getPrerequisite() {
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

    public /* synthetic */ AbstractC18503f(String str, String str2, String str3, boolean z10, AbstractC18503f abstractC18503f, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : abstractC18503f, null);
    }
}
