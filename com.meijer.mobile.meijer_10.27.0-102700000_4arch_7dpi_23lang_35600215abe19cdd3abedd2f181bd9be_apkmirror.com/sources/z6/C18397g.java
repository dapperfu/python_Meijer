package z6;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "Lz6/f;", "", "name", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: z6.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18397g {
    public static final String a(List<HttpHeader> list, String name) {
        Object next;
        Intrinsics.j(list, "<this>");
        Intrinsics.j(name, "name");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.H(((HttpHeader) next).getName(), name, true)) {
                break;
            }
        }
        HttpHeader httpHeader = (HttpHeader) next;
        if (httpHeader != null) {
            return httpHeader.getValue();
        }
        return null;
    }
}
