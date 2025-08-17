package kw;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010Jw\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b \u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\u001fR'\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\f8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lkw/k;", "", "", "isRegularFile", "isDirectory", "Lkw/B;", "symlinkTarget", "", "size", "createdAtMillis", "lastModifiedAtMillis", "lastAccessedAtMillis", "", "Lkotlin/reflect/KClass;", "extras", "<init>", "(ZZLkw/B;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V", "a", "(ZZLkw/B;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)Lkw/k;", "", "toString", "()Ljava/lang/String;", "Z", "()Z", "b", "e", "c", "Lkw/B;", "d", "()Lkw/B;", "Ljava/lang/Long;", "()Ljava/lang/Long;", "getCreatedAtMillis", "f", "getLastModifiedAtMillis", "g", "getLastAccessedAtMillis", "h", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kw.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C15334k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isRegularFile;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isDirectory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final B symlinkTarget;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Long size;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Long createdAtMillis;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Long lastModifiedAtMillis;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Long lastAccessedAtMillis;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<KClass<?>, Object> extras;

    public C15334k(boolean z10, boolean z11, B b10, Long l10, Long l11, Long l12, Long l13, Map<KClass<?>, ? extends Object> extras) {
        Intrinsics.j(extras, "extras");
        this.isRegularFile = z10;
        this.isDirectory = z11;
        this.symlinkTarget = b10;
        this.size = l10;
        this.createdAtMillis = l11;
        this.lastModifiedAtMillis = l12;
        this.lastAccessedAtMillis = l13;
        this.extras = MapsKt.A(extras);
    }

    public static /* synthetic */ C15334k b(C15334k c15334k, boolean z10, boolean z11, B b10, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c15334k.isRegularFile;
        }
        if ((i10 & 2) != 0) {
            z11 = c15334k.isDirectory;
        }
        if ((i10 & 4) != 0) {
            b10 = c15334k.symlinkTarget;
        }
        if ((i10 & 8) != 0) {
            l10 = c15334k.size;
        }
        if ((i10 & 16) != 0) {
            l11 = c15334k.createdAtMillis;
        }
        if ((i10 & 32) != 0) {
            l12 = c15334k.lastModifiedAtMillis;
        }
        if ((i10 & 64) != 0) {
            l13 = c15334k.lastAccessedAtMillis;
        }
        if ((i10 & 128) != 0) {
            map = c15334k.extras;
        }
        Long l14 = l13;
        Map map2 = map;
        Long l15 = l11;
        Long l16 = l12;
        return c15334k.a(z10, z11, b10, l10, l15, l16, l14, map2);
    }

    public final C15334k a(boolean isRegularFile, boolean isDirectory, B symlinkTarget, Long size, Long createdAtMillis, Long lastModifiedAtMillis, Long lastAccessedAtMillis, Map<KClass<?>, ? extends Object> extras) {
        Intrinsics.j(extras, "extras");
        return new C15334k(isRegularFile, isDirectory, symlinkTarget, size, createdAtMillis, lastModifiedAtMillis, lastAccessedAtMillis, extras);
    }

    /* renamed from: c, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    /* renamed from: d, reason: from getter */
    public final B getSymlinkTarget() {
        return this.symlinkTarget;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsDirectory() {
        return this.isDirectory;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.isRegularFile) {
            arrayList.add("isRegularFile");
        }
        if (this.isDirectory) {
            arrayList.add("isDirectory");
        }
        if (this.size != null) {
            arrayList.add("byteCount=" + this.size);
        }
        if (this.createdAtMillis != null) {
            arrayList.add("createdAt=" + this.createdAtMillis);
        }
        if (this.lastModifiedAtMillis != null) {
            arrayList.add("lastModifiedAt=" + this.lastModifiedAtMillis);
        }
        if (this.lastAccessedAtMillis != null) {
            arrayList.add("lastAccessedAt=" + this.lastAccessedAtMillis);
        }
        if (!this.extras.isEmpty()) {
            arrayList.add("extras=" + this.extras);
        }
        return CollectionsKt.B0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ C15334k(boolean z10, boolean z11, B b10, Long l10, Long l11, Long l12, Long l13, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : b10, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) != 0 ? null : l13, (i10 & 128) != 0 ? MapsKt.k() : map);
    }
}
