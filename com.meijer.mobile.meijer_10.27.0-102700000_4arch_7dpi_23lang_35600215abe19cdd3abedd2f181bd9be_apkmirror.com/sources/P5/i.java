package P5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final a f24781a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24782b;

    /* renamed from: c, reason: collision with root package name */
    private String f24783c;

    /* renamed from: d, reason: collision with root package name */
    private i f24784d;

    private enum a {
        FUNCTION,
        VARIABLE
    }

    protected Object a(x xVar, A a10) {
        return this.f24781a == a.FUNCTION ? a10.a(this.f24783c, this.f24784d.a(xVar, a10)) : xVar.a(this.f24782b);
    }

    i(String str) {
        Matcher matcher = Pattern.compile("\\(([^)]+)\\)").matcher(str);
        this.f24782b = str;
        if (matcher.find()) {
            this.f24784d = new i(matcher.group(1));
            this.f24783c = str.substring(0, matcher.start());
            this.f24781a = a.FUNCTION;
            return;
        }
        this.f24781a = a.VARIABLE;
    }
}
