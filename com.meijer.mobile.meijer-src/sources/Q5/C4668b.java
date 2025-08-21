package Q5;

import Q5.q;
import java.util.regex.Pattern;

/* renamed from: Q5.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4668b implements f {

    /* renamed from: a, reason: collision with root package name */
    private final a f27800a;

    /* renamed from: Q5.b$a */
    public enum a {
        DEFAULT,
        CASE_INSENSITIVE
    }

    private boolean c(Object obj, Object obj2) {
        return ((obj instanceof String) && (obj2 instanceof String) && this.f27800a == a.CASE_INSENSITIVE) ? obj.toString().equalsIgnoreCase(obj2.toString()) : obj.equals(obj2);
    }

    private boolean d(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return false;
        }
        String string = obj.toString();
        String string2 = obj2.toString();
        if (this.f27800a == a.CASE_INSENSITIVE) {
            string = string.toLowerCase();
            string2 = string2.toLowerCase();
        }
        return string.contains(string2);
    }

    private boolean e(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return false;
        }
        String string = obj.toString();
        String string2 = obj2.toString();
        return string.matches((this.f27800a == a.CASE_INSENSITIVE ? "(?i)" : "") + ".*" + Pattern.quote(string2));
    }

    private boolean f(Object obj) {
        return obj != null;
    }

    private boolean m(Object obj) {
        return obj == null;
    }

    private boolean n(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return false;
        }
        String string = obj.toString();
        String string2 = obj2.toString();
        return string.matches((this.f27800a == a.CASE_INSENSITIVE ? "(?i)" : "") + Pattern.quote(string2) + ".*");
    }

    public C4668b(a aVar) {
        this.f27800a = aVar;
    }

    private boolean g(Object obj, Object obj2) {
        Double dO = o(obj);
        Double dO2 = o(obj2);
        if (dO == null || dO2 == null || dO.doubleValue() <= dO2.doubleValue()) {
            return false;
        }
        return true;
    }

    private boolean h(Object obj, Object obj2) {
        Double dO = o(obj);
        Double dO2 = o(obj2);
        if (dO == null || dO2 == null || dO.doubleValue() < dO2.doubleValue()) {
            return false;
        }
        return true;
    }

    private boolean i(Object obj, Object obj2) {
        Double dO = o(obj);
        Double dO2 = o(obj2);
        if (dO == null || dO2 == null || dO.doubleValue() >= dO2.doubleValue()) {
            return false;
        }
        return true;
    }

    private boolean j(Object obj, Object obj2) {
        Double dO = o(obj);
        Double dO2 = o(obj2);
        if (dO == null || dO2 == null || dO.doubleValue() > dO2.doubleValue()) {
            return false;
        }
        return true;
    }

    private boolean k(Object obj, Object obj2) {
        return !d(obj, obj2);
    }

    private boolean l(Object obj, Object obj2) {
        return !c(obj, obj2);
    }

    private Double o(Object obj) {
        try {
            return Double.valueOf(obj.toString());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // Q5.f
    public <A> q a(String str, A a10) {
        boolean zF;
        str.getClass();
        if (!str.equals("exists")) {
            if (!str.equals("notExist")) {
                return new q(q.a.MISSING_OPERATOR, String.format("Operator is invalid \"%s\"", str));
            }
            zF = m(a10);
        } else {
            zF = f(a10);
        }
        if (zF) {
            return q.f27829d;
        }
        return new q(q.a.CONDITION_FAILED, String.format("Condition not matched for operation \"%s\"", str));
    }

    @Override // Q5.f
    public <A, B> q b(A a10, String str, B b10) {
        boolean zN;
        str.getClass();
        switch (str) {
            case "startsWith":
                zN = n(a10, b10);
                break;
            case "greaterEqual":
                zN = h(a10, b10);
                break;
            case "equals":
                zN = c(a10, b10);
                break;
            case "contains":
                zN = d(a10, b10);
                break;
            case "notContains":
                zN = k(a10, b10);
                break;
            case "lessEqual":
                zN = j(a10, b10);
                break;
            case "notEquals":
                zN = l(a10, b10);
                break;
            case "greaterThan":
                zN = g(a10, b10);
                break;
            case "endsWith":
                zN = e(a10, b10);
                break;
            case "lessThan":
                zN = i(a10, b10);
                break;
            default:
                return new q(q.a.MISSING_OPERATOR, String.format("Operator is invalid \"%s\"", str));
        }
        if (zN) {
            return q.f27829d;
        }
        return new q(q.a.CONDITION_FAILED, String.format("Condition not matched for operation \"%s\"", str));
    }
}
