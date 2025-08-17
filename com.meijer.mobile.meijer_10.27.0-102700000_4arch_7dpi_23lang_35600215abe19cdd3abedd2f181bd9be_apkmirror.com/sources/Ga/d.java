package Ga;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0001\nJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00138\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0018"}, d2 = {"LGa/d;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "type", "b", "c", "field", "comparison", "", "Ljava/util/List;", "()Ljava/util/List;", "expectations", "e", "predict-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String field;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String comparison;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> expectations;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type com.emarsys.predict.api.model.RecommendationFilter");
        d dVar = (d) other;
        return Intrinsics.e(this.type, dVar.type) && Intrinsics.e(this.field, dVar.field) && Intrinsics.e(this.comparison, dVar.comparison) && Intrinsics.e(this.expectations, dVar.expectations);
    }

    /* renamed from: a, reason: from getter */
    public final String getComparison() {
        return this.comparison;
    }

    public final List<String> b() {
        return this.expectations;
    }

    /* renamed from: c, reason: from getter */
    public final String getField() {
        return this.field;
    }

    /* renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.field.hashCode()) * 31) + this.comparison.hashCode()) * 31) + this.expectations.hashCode();
    }
}
