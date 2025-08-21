package hw;

import androidx.recyclerview.widget.RecyclerView;
import gw.B;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0010!\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b%\u0010(R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b)\u0010.R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010.R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b2\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=R\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b!\u0010ER\u0016\u0010G\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u00105R\u0016\u0010H\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u00105R\u0016\u0010I\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u00105¨\u0006J"}, d2 = {"Lhw/n;", "", "Lgw/B;", "canonicalPath", "", "isDirectory", "", "comment", "", "crc", "compressedSize", "size", "", "compressionMethod", "offset", "dosLastModifiedAtDate", "dosLastModifiedAtTime", "ntfsLastModifiedAtFiletime", "ntfsLastAccessedAtFiletime", "ntfsCreatedAtFiletime", "extendedLastModifiedAtSeconds", "extendedLastAccessedAtSeconds", "extendedCreatedAtSeconds", "<init>", "(Lgw/B;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lhw/n;", "Lgw/B;", "b", "()Lgw/B;", "Z", "k", "()Z", "c", "Ljava/lang/String;", "getComment", "()Ljava/lang/String;", "d", "J", "getCrc", "()J", "e", "f", "j", "g", "I", "()I", "h", "i", "getDosLastModifiedAtDate", "getDosLastModifiedAtTime", "Ljava/lang/Long;", "getNtfsLastModifiedAtFiletime", "()Ljava/lang/Long;", "l", "getNtfsLastAccessedAtFiletime", "m", "getNtfsCreatedAtFiletime", "n", "Ljava/lang/Integer;", "getExtendedLastModifiedAtSeconds", "()Ljava/lang/Integer;", "o", "getExtendedLastAccessedAtSeconds", "p", "getExtendedCreatedAtSeconds", "", "q", "Ljava/util/List;", "()Ljava/util/List;", "children", "lastAccessedAtMillis", "lastModifiedAtMillis", "createdAtMillis", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final B canonicalPath;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isDirectory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String comment;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long crc;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long compressedSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int compressionMethod;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long offset;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int dosLastModifiedAtDate;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int dosLastModifiedAtTime;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Long ntfsLastModifiedAtFiletime;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Long ntfsLastAccessedAtFiletime;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Long ntfsCreatedAtFiletime;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Integer extendedLastModifiedAtSeconds;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Integer extendedLastAccessedAtSeconds;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Integer extendedCreatedAtSeconds;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final List<B> children;

    public n(B canonicalPath, boolean z10, String comment, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        Intrinsics.j(canonicalPath, "canonicalPath");
        Intrinsics.j(comment, "comment");
        this.canonicalPath = canonicalPath;
        this.isDirectory = z10;
        this.comment = comment;
        this.crc = j10;
        this.compressedSize = j11;
        this.size = j12;
        this.compressionMethod = i10;
        this.offset = j13;
        this.dosLastModifiedAtDate = i11;
        this.dosLastModifiedAtTime = i12;
        this.ntfsLastModifiedAtFiletime = l10;
        this.ntfsLastAccessedAtFiletime = l11;
        this.ntfsCreatedAtFiletime = l12;
        this.extendedLastModifiedAtSeconds = num;
        this.extendedLastAccessedAtSeconds = num2;
        this.extendedCreatedAtSeconds = num3;
        this.children = new ArrayList();
    }

    public final n a(Integer extendedLastModifiedAtSeconds, Integer extendedLastAccessedAtSeconds, Integer extendedCreatedAtSeconds) {
        return new n(this.canonicalPath, this.isDirectory, this.comment, this.crc, this.compressedSize, this.size, this.compressionMethod, this.offset, this.dosLastModifiedAtDate, this.dosLastModifiedAtTime, this.ntfsLastModifiedAtFiletime, this.ntfsLastAccessedAtFiletime, this.ntfsCreatedAtFiletime, extendedLastModifiedAtSeconds, extendedLastAccessedAtSeconds, extendedCreatedAtSeconds);
    }

    /* renamed from: b, reason: from getter */
    public final B getCanonicalPath() {
        return this.canonicalPath;
    }

    public final List<B> c() {
        return this.children;
    }

    /* renamed from: d, reason: from getter */
    public final long getCompressedSize() {
        return this.compressedSize;
    }

    /* renamed from: e, reason: from getter */
    public final int getCompressionMethod() {
        return this.compressionMethod;
    }

    public final Long f() {
        Long l10 = this.ntfsCreatedAtFiletime;
        if (l10 != null) {
            return Long.valueOf(r.f(l10.longValue()));
        }
        if (this.extendedCreatedAtSeconds != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        return null;
    }

    public final Long g() {
        Long l10 = this.ntfsLastAccessedAtFiletime;
        if (l10 != null) {
            return Long.valueOf(r.f(l10.longValue()));
        }
        if (this.extendedLastAccessedAtSeconds != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        return null;
    }

    public final Long h() {
        Long l10 = this.ntfsLastModifiedAtFiletime;
        if (l10 != null) {
            return Long.valueOf(r.f(l10.longValue()));
        }
        if (this.extendedLastModifiedAtSeconds != null) {
            return Long.valueOf(r0.intValue() * 1000);
        }
        int i10 = this.dosLastModifiedAtTime;
        if (i10 != -1) {
            return r.e(this.dosLastModifiedAtDate, i10);
        }
        return null;
    }

    /* renamed from: i, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    /* renamed from: j, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsDirectory() {
        return this.isDirectory;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n(B b10, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num4;
        boolean z11;
        Integer num5;
        boolean z12 = (i13 & 2) != 0 ? false : z10;
        String str2 = (i13 & 4) != 0 ? "" : str;
        long j14 = (i13 & 8) != 0 ? -1L : j10;
        long j15 = (i13 & 16) != 0 ? -1L : j11;
        long j16 = (i13 & 32) != 0 ? -1L : j12;
        int i14 = (i13 & 64) != 0 ? -1 : i10;
        long j17 = (i13 & 128) == 0 ? j13 : -1L;
        int i15 = (i13 & 256) != 0 ? -1 : i11;
        int i16 = (i13 & 512) == 0 ? i12 : -1;
        Long l13 = (i13 & 1024) != 0 ? null : l10;
        Long l14 = (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? null : l11;
        boolean z13 = z12;
        Long l15 = (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : l12;
        Integer num6 = (i13 & 8192) != 0 ? null : num;
        Integer num7 = (i13 & 16384) != 0 ? null : num2;
        if ((i13 & 32768) != 0) {
            num4 = num6;
            z11 = z13;
            num5 = null;
        } else {
            num4 = num6;
            z11 = z13;
            num5 = num3;
        }
        this(b10, z11, str2, j14, j15, j16, i14, j17, i15, i16, l13, l14, l15, num4, num7, num5);
    }
}
