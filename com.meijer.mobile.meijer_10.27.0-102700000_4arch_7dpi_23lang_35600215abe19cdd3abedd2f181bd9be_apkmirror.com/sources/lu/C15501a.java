package lu;

import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Llu/a;", "Lcom/squareup/wire/ProtoAdapter;", "", "", "originalAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;)V", "Llu/o;", "writer", "", "tag", "value", "", "o", "(Llu/o;I[D)V", "p", "([D)I", "q", "(I[D)I", "n", "(Llu/o;[D)V", "Llu/n;", "reader", "m", "(Llu/n;)[D", "a0", "Lcom/squareup/wire/ProtoAdapter;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: lu.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15501a extends ProtoAdapter<double[]> {

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final ProtoAdapter<Double> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15501a(ProtoAdapter<Double> originalAdapter) {
        super(d.f149408e, Reflection.b(double[].class), null, originalAdapter.getSyntax(), new double[0], null, 32, null);
        Intrinsics.j(originalAdapter, "originalAdapter");
        this.originalAdapter = originalAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public double[] d(n reader) {
        Intrinsics.j(reader, "reader");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.f142820a;
        return new double[]{Double.longBitsToDouble(reader.l())};
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void e(o writer, double[] value) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(value, "value");
        for (double d10 : value) {
            this.originalAdapter.e(writer, Double.valueOf(d10));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void f(o writer, int tag, double[] value) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value != null) {
            if (value.length == 0) {
                return;
            }
            super.f(writer, tag, value);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int g(double[] value) {
        Intrinsics.j(value, "value");
        int iG = 0;
        for (double d10 : value) {
            iG += this.originalAdapter.g(Double.valueOf(d10));
        }
        return iG;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int h(int tag, double[] value) {
        if (value == null || value.length == 0) {
            return 0;
        }
        return super.h(tag, value);
    }
}
