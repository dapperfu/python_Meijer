package lh;

import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import java.util.Objects;

/* renamed from: lh.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C15497g {

    /* renamed from: a, reason: collision with root package name */
    public final String f149617a;

    /* renamed from: b, reason: collision with root package name */
    public final String f149618b;

    /* renamed from: c, reason: collision with root package name */
    public final LDContext f149619c;

    /* renamed from: d, reason: collision with root package name */
    public final LDValue f149620d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C15497g c15497g = (C15497g) obj;
            if (Objects.equals(this.f149617a, c15497g.f149617a) && Objects.equals(this.f149618b, c15497g.f149618b) && Objects.equals(this.f149619c, c15497g.f149619c) && Objects.equals(this.f149620d, c15497g.f149620d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f149617a, this.f149618b, this.f149619c, this.f149620d);
    }

    public C15497g(String str, String str2, LDContext lDContext, LDValue lDValue) {
        this.f149618b = str2;
        this.f149619c = lDContext;
        this.f149620d = lDValue;
        this.f149617a = str;
    }
}
