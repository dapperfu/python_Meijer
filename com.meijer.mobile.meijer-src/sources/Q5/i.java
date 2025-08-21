package Q5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final a f27811a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27812b;

    /* renamed from: c, reason: collision with root package name */
    private String f27813c;

    /* renamed from: d, reason: collision with root package name */
    private i f27814d;

    private enum a {
        FUNCTION,
        VARIABLE
    }

    protected Object a(x xVar, A a10) {
        return this.f27811a == a.FUNCTION ? a10.a(this.f27813c, this.f27814d.a(xVar, a10)) : xVar.a(this.f27812b);
    }

    i(String str) {
        Matcher matcher = Pattern.compile("\\(([^)]+)\\)").matcher(str);
        this.f27812b = str;
        if (matcher.find()) {
            this.f27814d = new i(matcher.group(1));
            this.f27813c = str.substring(0, matcher.start());
            this.f27811a = a.FUNCTION;
            return;
        }
        this.f27811a = a.VARIABLE;
    }
}
