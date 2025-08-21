package hu;

import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lhu/f;", "Lcom/squareup/wire/ProtoAdapter;", "", "<init>", "()V", "Lhu/o;", "writer", "value", "", "n", "(Lhu/o;F)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ljava/lang/Float;", "", "o", "(F)I", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends ProtoAdapter<Float> {
    public int o(float value) {
        return 4;
    }

    public f() {
        super(d.f136161f, Reflection.b(Float.TYPE), null, q.f136191c, Float.valueOf(0.0f), null, 32, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void e(o oVar, Float f10) throws IOException {
        n(oVar, f10.floatValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ int g(Float f10) {
        return o(f10.floatValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Float c(n reader) {
        Intrinsics.j(reader, "reader");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.f143729a;
        return Float.valueOf(Float.intBitsToFloat(reader.k()));
    }

    public void n(o writer, float value) throws IOException {
        Intrinsics.j(writer, "writer");
        writer.b(Float.floatToIntBits(value));
    }
}
