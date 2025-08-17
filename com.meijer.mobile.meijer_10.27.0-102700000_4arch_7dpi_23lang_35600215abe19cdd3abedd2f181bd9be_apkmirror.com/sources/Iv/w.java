package Iv;

import Fv.e;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.UStringsKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LIv/w;", "LDv/b;", "LIv/v;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;LIv/v;)V", "LGv/e;", "decoder", "f", "(LGv/e;)LIv/v;", "LFv/f;", "b", "LFv/f;", "a", "()LFv/f;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
final class w implements Dv.b<v> {

    /* renamed from: a, reason: collision with root package name */
    public static final w f14447a = new w();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Fv.f descriptor = Fv.l.b("kotlinx.serialization.json.JsonLiteral", e.i.f11113a);

    @Override // Dv.b, Dv.h, Dv.a
    /* renamed from: a */
    public Fv.f getDescriptor() {
        return descriptor;
    }

    @Override // Dv.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public v d(Gv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        i iVarG = r.d(decoder).g();
        if (iVarG instanceof v) {
            return (v) iVarG;
        }
        throw Jv.A.e(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.b(iVarG.getClass()), iVarG.toString());
    }

    @Override // Dv.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(Gv.f encoder, v value) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(value, "value");
        r.h(encoder);
        if (value.getIsString()) {
            encoder.E(value.getContent());
            return;
        }
        if (value.getCoerceToInlineType() != null) {
            encoder.D(value.getCoerceToInlineType()).E(value.getContent());
            return;
        }
        Long lX = StringsKt.x(value.getContent());
        if (lX != null) {
            encoder.q(lX.longValue());
            return;
        }
        ULong uLongH = UStringsKt.h(value.getContent());
        if (uLongH != null) {
            encoder.D(Ev.a.s(ULong.INSTANCE).getDescriptor()).q(uLongH.getData());
            return;
        }
        Double dT = StringsKt.t(value.getContent());
        if (dT != null) {
            encoder.g(dT.doubleValue());
            return;
        }
        Boolean boolX1 = StringsKt.x1(value.getContent());
        if (boolX1 != null) {
            encoder.t(boolX1.booleanValue());
        } else {
            encoder.E(value.getContent());
        }
    }

    private w() {
    }
}
