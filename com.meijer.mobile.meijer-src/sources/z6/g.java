package z6;

import com.apollographql.apollo.exception.NullOrMissingField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LD6/f;", "jsonReader", "", "name", "", "a", "(LD6/f;Ljava/lang/String;)Ljava/lang/Void;", "apollo-api"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "com/apollographql/apollo/api/Assertions")
@SourceDebugExtension
/* loaded from: classes4.dex */
final /* synthetic */ class g {
    public static final Void a(D6.f jsonReader, String name) {
        Intrinsics.j(jsonReader, "jsonReader");
        Intrinsics.j(name, "name");
        throw new NullOrMissingField("Field '" + name + "' is missing or null at path " + jsonReader.getPath());
    }
}
