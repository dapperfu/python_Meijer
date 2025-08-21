package Pm;

import Ik.Validation;
import Ik.c;
import Jk.k;
import androidx.compose.ui.text.AnnotatedString;
import java.lang.String;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty0;
import lj.C15514c;
import wk.C17898a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LPm/c;", "", "T", "LJk/k;", "Lkotlin/reflect/KProperty0;", "LIk/b;", "field", "fieldName", "<init>", "(Lkotlin/reflect/KProperty0;Ljava/lang/String;)V", "", "LIk/c;", "d", "()Ljava/util/List;", "f", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class c<T extends String> extends k<T> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String fieldName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(KProperty0<Validation<T>> field, String fieldName) {
        super(field, null, 2, 0 == true ? 1 : 0);
        Intrinsics.j(field, "field");
        Intrinsics.j(fieldName, "fieldName");
        this.fieldName = fieldName;
    }

    @Override // Jk.k
    public List<Ik.c> d() {
        int i10 = 0;
        AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
        T tI = i();
        if (tI != null) {
            int i11 = 0;
            while (i10 < tI.length()) {
                char cCharAt = tI.charAt(i10);
                int i12 = i11 + 1;
                if (i11 == 1 || i11 == 3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cCharAt);
                    sb2.append(':');
                    bVar.g(sb2.toString());
                } else {
                    bVar.append(cCharAt);
                }
                i10++;
                i11 = i12;
            }
        }
        return wk.d.b(bVar.q().toString(), C17898a.f167225a.u(), new C15514c()) != null ? CollectionsKt.m() : CollectionsKt.e(new c.Invalid(getFieldName(), null, "format not supported", 2, null));
    }

    @Override // Jk.k
    /* renamed from: g, reason: from getter */
    public String getFieldName() {
        return this.fieldName;
    }
}
