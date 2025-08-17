package Jv;

import Fv.n;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0003J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006\u001f"}, d2 = {"LJv/D;", "", "<init>", "()V", "", "e", "LFv/f;", "sd", "c", "(LFv/f;)V", "", "index", "g", "(I)V", "key", "f", "(Ljava/lang/Object;)V", "d", "b", "", "a", "()Ljava/lang/String;", "toString", "", "[Ljava/lang/Object;", "currentObjectPath", "", "[I", "indicies", "I", "currentDepth", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Object[] currentObjectPath = new Object[8];

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int[] indicies;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int currentDepth;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJv/D$a;", "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16168a = new a();

        private a() {
        }
    }

    private final void e() {
        int i10 = this.currentDepth * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.currentObjectPath, i10);
        Intrinsics.i(objArrCopyOf, "copyOf(...)");
        this.currentObjectPath = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.indicies, i10);
        Intrinsics.i(iArrCopyOf, "copyOf(...)");
        this.indicies = iArrCopyOf;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.currentDepth + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.currentObjectPath[i11];
            if (obj instanceof Fv.f) {
                Fv.f fVar = (Fv.f) obj;
                if (!Intrinsics.e(fVar.f(), n.b.f11134a)) {
                    int i12 = this.indicies[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(fVar.j(i12));
                    }
                } else if (this.indicies[i11] != -1) {
                    sb2.append("[");
                    sb2.append(this.indicies[i11]);
                    sb2.append("]");
                }
            } else if (obj != a.f16168a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public final void b() {
        int i10 = this.currentDepth;
        int[] iArr = this.indicies;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.currentDepth = i10 - 1;
        }
        int i11 = this.currentDepth;
        if (i11 != -1) {
            this.currentDepth = i11 - 1;
        }
    }

    public final void c(Fv.f sd2) {
        Intrinsics.j(sd2, "sd");
        int i10 = this.currentDepth + 1;
        this.currentDepth = i10;
        if (i10 == this.currentObjectPath.length) {
            e();
        }
        this.currentObjectPath[i10] = sd2;
    }

    public final void d() {
        int[] iArr = this.indicies;
        int i10 = this.currentDepth;
        if (iArr[i10] == -2) {
            this.currentObjectPath[i10] = a.f16168a;
        }
    }

    public final void f(Object key) {
        int[] iArr = this.indicies;
        int i10 = this.currentDepth;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.currentDepth = i11;
            if (i11 == this.currentObjectPath.length) {
                e();
            }
        }
        Object[] objArr = this.currentObjectPath;
        int i12 = this.currentDepth;
        objArr[i12] = key;
        this.indicies[i12] = -2;
    }

    public final void g(int index) {
        this.indicies[this.currentDepth] = index;
    }

    public D() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.indicies = iArr;
        this.currentDepth = -1;
    }

    public String toString() {
        return a();
    }
}
