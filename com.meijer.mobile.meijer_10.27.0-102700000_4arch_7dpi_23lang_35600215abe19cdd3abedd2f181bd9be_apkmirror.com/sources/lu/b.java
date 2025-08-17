package lu;

import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Llu/b;", "Lcom/squareup/wire/ProtoAdapter;", "", "<init>", "()V", "value", "", "o", "(D)I", "Llu/o;", "writer", "", "n", "(Llu/o;D)V", "Llu/n;", "reader", "m", "(Llu/n;)Ljava/lang/Double;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends ProtoAdapter<Double> {
    public b() {
        super(d.f149407d, Reflection.b(Double.TYPE), null, q.f149439c, Double.valueOf(0.0d), null, 32, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void e(o oVar, Double d10) throws IOException {
        n(oVar, d10.doubleValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ int g(Double d10) {
        return o(d10.doubleValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Double d(n reader) {
        Intrinsics.j(reader, "reader");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.f142820a;
        return Double.valueOf(Double.longBitsToDouble(reader.l()));
    }

    public void n(o writer, double value) throws IOException {
        Intrinsics.j(writer, "writer");
        writer.c(Double.doubleToLongBits(value));
    }

    public int o(double value) {
        return 8;
    }
}
