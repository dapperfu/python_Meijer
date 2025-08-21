package Zj;

import Yj.StandardRestError;
import Yj.e;
import com.meijer.mobile.core.error.model.json.StandardRestErrorBody;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/meijer/mobile/core/error/model/json/StandardRestErrorBody;", "LYj/b;", "a", "(Lcom/meijer/mobile/core/error/model/json/StandardRestErrorBody;)LYj/b;", "json_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {
    public static final Yj.b a(StandardRestErrorBody standardRestErrorBody) {
        Intrinsics.j(standardRestErrorBody, "<this>");
        return new StandardRestError(e.a(standardRestErrorBody.getType()), standardRestErrorBody.getTitle(), standardRestErrorBody.getDetail(), standardRestErrorBody.getStatus(), standardRestErrorBody.getTraceId(), standardRestErrorBody.getReferenceCode(), standardRestErrorBody.getSource(), null);
    }
}
