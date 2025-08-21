package Ev;

import Fv.U;
import Fv.X;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.json.internal.JsonDecodingException;

@Metadata(d1 = {"\u0000L\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000e\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u0011\u001a\u00020\u0002*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0019\u001a\u00020\u0016*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u001d\u001a\u00020\u001a*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0015\u0010!\u001a\u00020\u001e*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0017\u0010%\u001a\u0004\u0018\u00010\"*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0017\u0010(\u001a\u0004\u0018\u00010\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"", "value", "LEv/E;", "a", "(Ljava/lang/String;)LEv/E;", "LEv/i;", "element", "", "b", "(LEv/i;Ljava/lang/String;)Ljava/lang/Void;", "LBv/f;", "LBv/f;", "i", "()LBv/f;", "jsonUnquotedLiteralDescriptor", "h", "(LEv/i;)LEv/E;", "jsonPrimitive", "", "g", "(LEv/E;)I", "int", "", "j", "(LEv/E;)J", "long", "", "e", "(LEv/E;)D", "double", "", "f", "(LEv/E;)F", "float", "", "c", "(LEv/E;)Ljava/lang/Boolean;", "booleanOrNull", "d", "(LEv/E;)Ljava/lang/String;", "contentOrNull", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Bv.f f8642a = Dv.B.a("kotlinx.serialization.json.JsonUnquotedLiteral", Av.a.D(StringCompanionObject.f143748a));

    public static final E a(String str) {
        return str == null ? z.INSTANCE : new v(str, true, null, 4, null);
    }

    private static final Void b(i iVar, String str) {
        throw new IllegalArgumentException("Element " + Reflection.b(iVar.getClass()) + " is not a " + str);
    }

    public static final Boolean c(E e10) {
        Intrinsics.j(e10, "<this>");
        return X.d(e10.getContent());
    }

    public static final String d(E e10) {
        Intrinsics.j(e10, "<this>");
        if (e10 instanceof z) {
            return null;
        }
        return e10.getContent();
    }

    public static final double e(E e10) {
        Intrinsics.j(e10, "<this>");
        return Double.parseDouble(e10.getContent());
    }

    public static final float f(E e10) {
        Intrinsics.j(e10, "<this>");
        return Float.parseFloat(e10.getContent());
    }

    public static final int g(E e10) {
        Intrinsics.j(e10, "<this>");
        try {
            long jM = new U(e10.getContent()).m();
            if (-2147483648L <= jM && jM <= 2147483647L) {
                return (int) jM;
            }
            throw new NumberFormatException(e10.getContent() + " is not an Int");
        } catch (JsonDecodingException e11) {
            throw new NumberFormatException(e11.getMessage());
        }
    }

    public static final E h(i iVar) {
        Intrinsics.j(iVar, "<this>");
        E e10 = iVar instanceof E ? (E) iVar : null;
        if (e10 != null) {
            return e10;
        }
        b(iVar, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final Bv.f i() {
        return f8642a;
    }

    public static final long j(E e10) {
        Intrinsics.j(e10, "<this>");
        try {
            return new U(e10.getContent()).m();
        } catch (JsonDecodingException e11) {
            throw new NumberFormatException(e11.getMessage());
        }
    }
}
