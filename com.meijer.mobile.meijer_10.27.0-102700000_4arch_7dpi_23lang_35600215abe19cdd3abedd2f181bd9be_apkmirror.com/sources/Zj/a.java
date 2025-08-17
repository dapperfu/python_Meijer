package Zj;

import Hk.Validation;
import Hk.c;
import ak.AbstractC5607a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u00030\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"LZj/a;", "T", "LHk/a;", "LHk/b;", "c", "()LHk/b;", "validation", "Lak/a;", "b", "()Lak/a;", "errorMessage", "", "", "a", "()Ljava/util/List;", "validations", "forms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface a<T> extends Hk.a<a<T>> {
    Validation<T> c();

    @Override // Hk.a
    default List<Validation<? extends Object>> a() {
        return CollectionsKt.e(c());
    }

    default AbstractC5607a b() {
        c cVar = (c) CollectionsKt.u0(d());
        if (cVar != null) {
            return AbstractC5607a.INSTANCE.c(cVar.getFieldName() + ' ' + cVar.getMessage());
        }
        return null;
    }
}
