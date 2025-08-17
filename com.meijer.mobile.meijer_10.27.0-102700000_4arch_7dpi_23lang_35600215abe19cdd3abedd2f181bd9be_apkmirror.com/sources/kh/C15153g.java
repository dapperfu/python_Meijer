package kh;

import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import java.util.Objects;

/* renamed from: kh.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C15153g {

    /* renamed from: a, reason: collision with root package name */
    public final String f141934a;

    /* renamed from: b, reason: collision with root package name */
    public final String f141935b;

    /* renamed from: c, reason: collision with root package name */
    public final LDContext f141936c;

    /* renamed from: d, reason: collision with root package name */
    public final LDValue f141937d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C15153g c15153g = (C15153g) obj;
            if (Objects.equals(this.f141934a, c15153g.f141934a) && Objects.equals(this.f141935b, c15153g.f141935b) && Objects.equals(this.f141936c, c15153g.f141936c) && Objects.equals(this.f141937d, c15153g.f141937d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f141934a, this.f141935b, this.f141936c, this.f141937d);
    }

    public C15153g(String str, String str2, LDContext lDContext, LDValue lDValue) {
        this.f141935b = str2;
        this.f141936c = lDContext;
        this.f141937d = lDValue;
        this.f141934a = str;
    }
}
