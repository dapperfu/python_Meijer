package gw;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0016"}, d2 = {"Lgw/D;", "", "<init>", "()V", "", "vacantIndex", "Lgw/c;", "node", "", "d", "(ILgw/c;)V", "c", "b", "()Lgw/c;", "a", "(Lgw/c;)V", "e", "I", "size", "", "[Lgw/c;", "array", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public int size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public C14414c[] array = new C14414c[8];

    private final void c(int vacantIndex, C14414c node) {
        C14414c c14414c;
        while (true) {
            int i10 = vacantIndex << 1;
            int i11 = i10 + 1;
            int i12 = this.size;
            if (i11 > i12) {
                if (i10 > i12) {
                    break;
                }
                c14414c = this.array[i10];
                Intrinsics.g(c14414c);
            } else {
                c14414c = this.array[i10];
                Intrinsics.g(c14414c);
                C14414c c14414c2 = this.array[i11];
                Intrinsics.g(c14414c2);
                if (Intrinsics.l(0L, c14414c2.getTimeoutNanos() - c14414c.getTimeoutNanos()) >= 0) {
                    c14414c = c14414c2;
                }
            }
            if (Intrinsics.l(0L, c14414c.getTimeoutNanos() - node.getTimeoutNanos()) <= 0) {
                break;
            }
            int i13 = c14414c.index;
            c14414c.index = vacantIndex;
            this.array[vacantIndex] = c14414c;
            vacantIndex = i13;
        }
        this.array[vacantIndex] = node;
        node.index = vacantIndex;
    }

    private final void d(int vacantIndex, C14414c node) {
        while (true) {
            int i10 = vacantIndex >> 1;
            if (i10 == 0) {
                break;
            }
            C14414c c14414c = this.array[i10];
            Intrinsics.g(c14414c);
            if (Intrinsics.l(0L, node.getTimeoutNanos() - c14414c.getTimeoutNanos()) <= 0) {
                break;
            }
            c14414c.index = vacantIndex;
            this.array[vacantIndex] = c14414c;
            vacantIndex = i10;
        }
        this.array[vacantIndex] = node;
        node.index = vacantIndex;
    }

    public final void a(C14414c node) {
        Intrinsics.j(node, "node");
        int i10 = this.size + 1;
        this.size = i10;
        C14414c[] c14414cArr = this.array;
        if (i10 == c14414cArr.length) {
            C14414c[] c14414cArr2 = new C14414c[i10 * 2];
            ArraysKt.t(c14414cArr, c14414cArr2, 0, 0, 0, 14, null);
            this.array = c14414cArr2;
        }
        d(i10, node);
    }

    public final C14414c b() {
        return this.array[1];
    }

    public final void e(C14414c node) {
        Intrinsics.j(node, "node");
        int i10 = node.index;
        if (i10 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i11 = this.size;
        C14414c c14414c = this.array[i11];
        Intrinsics.g(c14414c);
        node.index = -1;
        this.array[i11] = null;
        this.size = i11 - 1;
        if (node == c14414c) {
            return;
        }
        int iL = Intrinsics.l(0L, c14414c.getTimeoutNanos() - node.getTimeoutNanos());
        if (iL == 0) {
            this.array[i10] = c14414c;
            c14414c.index = i10;
        } else if (iL < 0) {
            c(i10, c14414c);
        } else {
            d(i10, c14414c);
        }
    }
}
