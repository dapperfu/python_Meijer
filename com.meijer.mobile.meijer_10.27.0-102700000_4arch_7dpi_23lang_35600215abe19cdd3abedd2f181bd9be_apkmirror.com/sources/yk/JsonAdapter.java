package yk;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.g;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import java.io.IOException;
import java.lang.Enum;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lyk/a;", "", "T", "Lcom/squareup/moshi/h;", "Ljava/lang/Class;", "enumType", "<init>", "(Ljava/lang/Class;)V", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Ljava/lang/Enum;", "Lcom/squareup/moshi/q;", "writer", "value", "", "b", "(Lcom/squareup/moshi/q;Ljava/lang/Enum;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Class;", "", "[Ljava/lang/String;", "nameStrings", "c", "[Ljava/lang/Enum;", "constants", "Lcom/squareup/moshi/k$b;", "d", "Lcom/squareup/moshi/k$b;", "options", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yk.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final class JsonAdapter<T extends Enum<T>> extends h<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<T> enumType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String[] nameStrings;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final T[] constants;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private k.b options;

    public JsonAdapter(Class<T> enumType) {
        String strName;
        Intrinsics.j(enumType, "enumType");
        this.enumType = enumType;
        try {
            T[] enumConstants = enumType.getEnumConstants();
            Intrinsics.g(enumConstants);
            T[] tArr = enumConstants;
            this.constants = tArr;
            this.nameStrings = new String[tArr.length];
            int length = tArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                T t10 = this.constants[i10];
                g gVar = (g) this.enumType.getField(t10.name()).getAnnotation(g.class);
                if (gVar == null || (strName = gVar.name()) == null) {
                    strName = t10.name();
                }
                this.nameStrings[i10] = strName;
            }
            String[] strArr = this.nameStrings;
            k.b bVarA = k.b.a((String[]) Arrays.copyOf(strArr, strArr.length));
            Intrinsics.i(bVarA, "of(...)");
            this.options = bVarA;
        } catch (NoSuchFieldException e10) {
            throw new AssertionError("Missing field in " + this.enumType.getName(), e10);
        }
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public T fromJson(k reader) throws IOException {
        Intrinsics.j(reader, "reader");
        String strNextString = reader.nextString();
        int iIndexOf = this.options.b().indexOf(strNextString);
        if (iIndexOf != -1) {
            return this.constants[iIndexOf];
        }
        String path = reader.getPath();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected one of ");
        String[] strArr = this.nameStrings;
        sb2.append(CollectionsKt.p(Arrays.copyOf(strArr, strArr.length)));
        sb2.append(" but was ");
        sb2.append(strNextString);
        sb2.append(" at path ");
        sb2.append(path);
        throw new JsonDataException(sb2.toString());
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, T value) throws IOException {
        Intrinsics.j(writer, "writer");
        String[] strArr = this.nameStrings;
        Intrinsics.g(value);
        writer.R(strArr[value.ordinal()]);
    }

    public String toString() {
        return "JsonAdapter(" + this.enumType.getName() + ')';
    }
}
