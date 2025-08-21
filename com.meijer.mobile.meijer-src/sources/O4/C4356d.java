package O4;

import X4.NetworkRequestCompat;
import android.annotation.SuppressLint;
import android.net.NetworkRequest;
import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0003&*.B1\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB;\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bB_\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0012Bg\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0015B\u0011\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u0019J\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0097\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0014\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010/R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010/R\u001a\u0010\r\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b*\u00102R\u001a\u0010\u000e\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b&\u00102R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b.\u00104R\u0013\u00107\u001a\u0004\u0018\u0001058G¢\u0006\u0006\u001a\u0004\b0\u00106¨\u00068"}, d2 = {"LO4/d;", "", "LO4/w;", "requiredNetworkType", "", "requiresCharging", "requiresBatteryNotLow", "requiresStorageNotLow", "<init>", "(LO4/w;ZZZ)V", "requiresDeviceIdle", "(LO4/w;ZZZZ)V", "", "contentTriggerUpdateDelayMillis", "contentTriggerMaxDelayMillis", "", "LO4/d$c;", "contentUriTriggers", "(LO4/w;ZZZZJJLjava/util/Set;)V", "LX4/y;", "requiredNetworkRequestCompat", "(LX4/y;LO4/w;ZZZZJJLjava/util/Set;)V", "other", "(LO4/d;)V", "i", "()Z", "j", "h", "k", "g", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "LO4/w;", "f", "()LO4/w;", "b", "LX4/y;", "e", "()LX4/y;", "c", "Z", "d", "J", "()J", "Ljava/util/Set;", "()Ljava/util/Set;", "Landroid/net/NetworkRequest;", "()Landroid/net/NetworkRequest;", "requiredNetworkRequest", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4356d {

    /* renamed from: k, reason: collision with root package name */
    @JvmField
    public static final C4356d f23154k = new C4356d(null, false, false, false, 15, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final EnumC4374w requiredNetworkType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final NetworkRequestCompat requiredNetworkRequestCompat;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requiresCharging;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requiresDeviceIdle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requiresBatteryNotLow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requiresStorageNotLow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long contentTriggerUpdateDelayMillis;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long contentTriggerMaxDelayMillis;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<c> contentUriTriggers;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LO4/d$a;", "", "<init>", "()V", "LO4/w;", "networkType", "b", "(LO4/w;)LO4/d$a;", "LO4/d;", "a", "()LO4/d;", "", "Z", "requiresCharging", "requiresDeviceIdle", "LX4/y;", "c", "LX4/y;", "requiredNetworkRequest", "d", "LO4/w;", "requiredNetworkType", "e", "requiresBatteryNotLow", "f", "requiresStorageNotLow", "", "g", "J", "triggerContentUpdateDelay", "h", "triggerContentMaxDelay", "", "LO4/d$c;", "i", "Ljava/util/Set;", "contentUriTriggers", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O4.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean requiresCharging;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean requiresDeviceIdle;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean requiresBatteryNotLow;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean requiresStorageNotLow;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private NetworkRequestCompat requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private EnumC4374w requiredNetworkType = EnumC4374w.NOT_REQUIRED;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private long triggerContentUpdateDelay = -1;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private long triggerContentMaxDelay = -1;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private Set<c> contentUriTriggers = new LinkedHashSet();

        public final C4356d a() {
            Set setO1 = CollectionsKt.o1(this.contentUriTriggers);
            return new C4356d(this.requiredNetworkRequest, this.requiredNetworkType, this.requiresCharging, this.requiresDeviceIdle, this.requiresBatteryNotLow, this.requiresStorageNotLow, this.triggerContentUpdateDelay, this.triggerContentMaxDelay, setO1);
        }

        public final a b(EnumC4374w networkType) {
            Intrinsics.j(networkType, "networkType");
            this.requiredNetworkType = networkType;
            this.requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LO4/d$c;", "", "Landroid/net/Uri;", "uri", "", "isTriggeredForDescendants", "<init>", "(Landroid/net/Uri;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "b", "Z", "()Z", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O4.d$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Uri uri;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isTriggeredForDescendants;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.e(c.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.h(other, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) other;
            return Intrinsics.e(this.uri, cVar.uri) && this.isTriggeredForDescendants == cVar.isTriggeredForDescendants;
        }

        public c(Uri uri, boolean z10) {
            Intrinsics.j(uri, "uri");
            this.uri = uri;
            this.isTriggeredForDescendants = z10;
        }

        /* renamed from: a, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getIsTriggeredForDescendants() {
            return this.isTriggeredForDescendants;
        }

        public int hashCode() {
            return (this.uri.hashCode() * 31) + Boolean.hashCode(this.isTriggeredForDescendants);
        }
    }

    public /* synthetic */ C4356d(EnumC4374w enumC4374w, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EnumC4374w.NOT_REQUIRED : enumC4374w, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12);
    }

    /* renamed from: a, reason: from getter */
    public final long getContentTriggerMaxDelayMillis() {
        return this.contentTriggerMaxDelayMillis;
    }

    /* renamed from: b, reason: from getter */
    public final long getContentTriggerUpdateDelayMillis() {
        return this.contentTriggerUpdateDelayMillis;
    }

    public final Set<c> c() {
        return this.contentUriTriggers;
    }

    public final NetworkRequest d() {
        return this.requiredNetworkRequestCompat.b();
    }

    /* renamed from: e, reason: from getter */
    public final NetworkRequestCompat getRequiredNetworkRequestCompat() {
        return this.requiredNetworkRequestCompat;
    }

    @SuppressLint({"NewApi"})
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.e(C4356d.class, other.getClass())) {
            return false;
        }
        C4356d c4356d = (C4356d) other;
        if (this.requiresCharging == c4356d.requiresCharging && this.requiresDeviceIdle == c4356d.requiresDeviceIdle && this.requiresBatteryNotLow == c4356d.requiresBatteryNotLow && this.requiresStorageNotLow == c4356d.requiresStorageNotLow && this.contentTriggerUpdateDelayMillis == c4356d.contentTriggerUpdateDelayMillis && this.contentTriggerMaxDelayMillis == c4356d.contentTriggerMaxDelayMillis && Intrinsics.e(d(), c4356d.d()) && this.requiredNetworkType == c4356d.requiredNetworkType) {
            return Intrinsics.e(this.contentUriTriggers, c4356d.contentUriTriggers);
        }
        return false;
    }

    /* renamed from: f, reason: from getter */
    public final EnumC4374w getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final boolean g() {
        return !this.contentUriTriggers.isEmpty();
    }

    /* renamed from: h, reason: from getter */
    public final boolean getRequiresBatteryNotLow() {
        return this.requiresBatteryNotLow;
    }

    @SuppressLint({"NewApi"})
    public int hashCode() {
        int iHashCode = ((((((((this.requiredNetworkType.hashCode() * 31) + (this.requiresCharging ? 1 : 0)) * 31) + (this.requiresDeviceIdle ? 1 : 0)) * 31) + (this.requiresBatteryNotLow ? 1 : 0)) * 31) + (this.requiresStorageNotLow ? 1 : 0)) * 31;
        long j10 = this.contentTriggerUpdateDelayMillis;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.contentTriggerMaxDelayMillis;
        int iHashCode2 = (((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.contentUriTriggers.hashCode()) * 31;
        NetworkRequest networkRequestD = d();
        return iHashCode2 + (networkRequestD != null ? networkRequestD.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getRequiresDeviceIdle() {
        return this.requiresDeviceIdle;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getRequiresStorageNotLow() {
        return this.requiresStorageNotLow;
    }

    @SuppressLint({"NewApi"})
    public String toString() {
        return "Constraints{requiredNetworkType=" + this.requiredNetworkType + ", requiresCharging=" + this.requiresCharging + ", requiresDeviceIdle=" + this.requiresDeviceIdle + ", requiresBatteryNotLow=" + this.requiresBatteryNotLow + ", requiresStorageNotLow=" + this.requiresStorageNotLow + ", contentTriggerUpdateDelayMillis=" + this.contentTriggerUpdateDelayMillis + ", contentTriggerMaxDelayMillis=" + this.contentTriggerMaxDelayMillis + ", contentUriTriggers=" + this.contentUriTriggers + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"NewApi"})
    public C4356d(EnumC4374w requiredNetworkType, boolean z10, boolean z11, boolean z12) {
        this(requiredNetworkType, z10, false, z11, z12);
        Intrinsics.j(requiredNetworkType, "requiredNetworkType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"NewApi"})
    public C4356d(EnumC4374w requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13) {
        this(requiredNetworkType, z10, z11, z12, z13, -1L, 0L, null, 192, null);
        Intrinsics.j(requiredNetworkType, "requiredNetworkType");
    }

    public /* synthetic */ C4356d(EnumC4374w enumC4374w, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EnumC4374w.NOT_REQUIRED : enumC4374w, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13, (i10 & 32) != 0 ? -1L : j10, (i10 & 64) != 0 ? -1L : j11, (i10 & 128) != 0 ? SetsKt.e() : set);
    }

    public C4356d(EnumC4374w requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set<c> contentUriTriggers) {
        Intrinsics.j(requiredNetworkType, "requiredNetworkType");
        Intrinsics.j(contentUriTriggers, "contentUriTriggers");
        this.requiredNetworkRequestCompat = new NetworkRequestCompat(null, 1, null);
        this.requiredNetworkType = requiredNetworkType;
        this.requiresCharging = z10;
        this.requiresDeviceIdle = z11;
        this.requiresBatteryNotLow = z12;
        this.requiresStorageNotLow = z13;
        this.contentTriggerUpdateDelayMillis = j10;
        this.contentTriggerMaxDelayMillis = j11;
        this.contentUriTriggers = contentUriTriggers;
    }

    public C4356d(NetworkRequestCompat requiredNetworkRequestCompat, EnumC4374w requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set<c> contentUriTriggers) {
        Intrinsics.j(requiredNetworkRequestCompat, "requiredNetworkRequestCompat");
        Intrinsics.j(requiredNetworkType, "requiredNetworkType");
        Intrinsics.j(contentUriTriggers, "contentUriTriggers");
        this.requiredNetworkRequestCompat = requiredNetworkRequestCompat;
        this.requiredNetworkType = requiredNetworkType;
        this.requiresCharging = z10;
        this.requiresDeviceIdle = z11;
        this.requiresBatteryNotLow = z12;
        this.requiresStorageNotLow = z13;
        this.contentTriggerUpdateDelayMillis = j10;
        this.contentTriggerMaxDelayMillis = j11;
        this.contentUriTriggers = contentUriTriggers;
    }

    @SuppressLint({"NewApi"})
    public C4356d(C4356d other) {
        Intrinsics.j(other, "other");
        this.requiresCharging = other.requiresCharging;
        this.requiresDeviceIdle = other.requiresDeviceIdle;
        this.requiredNetworkRequestCompat = other.requiredNetworkRequestCompat;
        this.requiredNetworkType = other.requiredNetworkType;
        this.requiresBatteryNotLow = other.requiresBatteryNotLow;
        this.requiresStorageNotLow = other.requiresStorageNotLow;
        this.contentUriTriggers = other.contentUriTriggers;
        this.contentTriggerUpdateDelayMillis = other.contentTriggerUpdateDelayMillis;
        this.contentTriggerMaxDelayMillis = other.contentTriggerMaxDelayMillis;
    }
}
