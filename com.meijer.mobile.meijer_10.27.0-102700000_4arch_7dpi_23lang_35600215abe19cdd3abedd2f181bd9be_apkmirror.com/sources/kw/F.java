package kw;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0018B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0003J\u001d\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001f¨\u0006#"}, d2 = {"Lkw/F;", "", "<init>", "()V", "", "data", "", "pos", "limit", "", "shared", "owner", "([BIIZZ)V", "d", "()Lkw/F;", "f", "b", "segment", "c", "(Lkw/F;)Lkw/F;", "byteCount", "e", "(I)Lkw/F;", "", "a", "sink", "g", "(Lkw/F;I)V", "[B", "I", "Z", "Lkw/F;", "next", "prev", "h", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final byte[] data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int pos;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int limit;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public boolean shared;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public boolean owner;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public F next;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public F prev;

    public F() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final F d() {
        this.shared = true;
        return new F(this.data, this.pos, this.limit, true, false);
    }

    public final void a() {
        int i10;
        F f10 = this.prev;
        if (f10 == this) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.g(f10);
        if (f10.owner) {
            int i11 = this.limit - this.pos;
            F f11 = this.prev;
            Intrinsics.g(f11);
            int i12 = 8192 - f11.limit;
            F f12 = this.prev;
            Intrinsics.g(f12);
            if (f12.shared) {
                i10 = 0;
            } else {
                F f13 = this.prev;
                Intrinsics.g(f13);
                i10 = f13.pos;
            }
            if (i11 > i12 + i10) {
                return;
            }
            F f14 = this.prev;
            Intrinsics.g(f14);
            g(f14, i11);
            b();
            G.b(this);
        }
    }

    public final F b() {
        F f10 = this.next;
        if (f10 == this) {
            f10 = null;
        }
        F f11 = this.prev;
        Intrinsics.g(f11);
        f11.next = this.next;
        F f12 = this.next;
        Intrinsics.g(f12);
        f12.prev = this.prev;
        this.next = null;
        this.prev = null;
        return f10;
    }

    public final F c(F segment) {
        Intrinsics.j(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        F f10 = this.next;
        Intrinsics.g(f10);
        f10.prev = segment;
        this.next = segment;
        return segment;
    }

    public final F e(int byteCount) {
        F fC;
        if (byteCount <= 0 || byteCount > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (byteCount >= 1024) {
            fC = d();
        } else {
            fC = G.c();
            byte[] bArr = this.data;
            byte[] bArr2 = fC.data;
            int i10 = this.pos;
            ArraysKt.p(bArr, bArr2, 0, i10, i10 + byteCount, 2, null);
        }
        fC.limit = fC.pos + byteCount;
        this.pos += byteCount;
        F f10 = this.prev;
        Intrinsics.g(f10);
        f10.c(fC);
        return fC;
    }

    public final F f() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.i(bArrCopyOf, "copyOf(...)");
        return new F(bArrCopyOf, this.pos, this.limit, false, true);
    }

    public final void g(F sink, int byteCount) {
        Intrinsics.j(sink, "sink");
        if (!sink.owner) {
            throw new IllegalStateException("only owner can write");
        }
        int i10 = sink.limit;
        if (i10 + byteCount > 8192) {
            if (sink.shared) {
                throw new IllegalArgumentException();
            }
            int i11 = sink.pos;
            if ((i10 + byteCount) - i11 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            ArraysKt.p(bArr, bArr, 0, i11, i10, 2, null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i12 = sink.limit;
        int i13 = this.pos;
        ArraysKt.j(bArr2, bArr3, i12, i13, i13 + byteCount);
        sink.limit += byteCount;
        this.pos += byteCount;
    }

    public F(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.j(data, "data");
        this.data = data;
        this.pos = i10;
        this.limit = i11;
        this.shared = z10;
        this.owner = z11;
    }
}
