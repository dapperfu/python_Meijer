package requests;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import gu.C14410c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import responses.PostalAddress;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lrequests/TaxAreaLookupJsonAdapter;", "Lcom/squareup/moshi/h;", "Lrequests/TaxAreaLookup;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lrequests/TaxAreaLookup;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lrequests/TaxAreaLookup;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "nullableStringAdapter", "Lcom/squareup/moshi/h;", "Lresponses/PostalAddress;", "nullablePostalAddressAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "validation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: requests.TaxAreaLookupJsonAdapter, reason: from toString */
/* loaded from: classes14.dex */
public final class GeneratedJsonAdapter extends h<TaxAreaLookup> {
    private volatile Constructor<TaxAreaLookup> constructorRef;
    private final h<PostalAddress> nullablePostalAddressAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("asOfDate", "lookupId", "PostalAddress");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "asOfDate");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableStringAdapter = hVarF;
        h<PostalAddress> hVarF2 = moshi.f(PostalAddress.class, SetsKt.e(), "postalAddress");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullablePostalAddressAdapter = hVarF2;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public TaxAreaLookup fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        String strFromJson = null;
        String strFromJson2 = null;
        PostalAddress postalAddressFromJson = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
                i10 &= -2;
            } else if (iZ == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                i10 &= -3;
            } else if (iZ == 2) {
                postalAddressFromJson = this.nullablePostalAddressAdapter.fromJson(reader);
                i10 &= -5;
            }
        }
        reader.d();
        if (i10 == -8) {
            return new TaxAreaLookup(strFromJson, strFromJson2, postalAddressFromJson);
        }
        Constructor<TaxAreaLookup> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = TaxAreaLookup.class.getDeclaredConstructor(String.class, String.class, PostalAddress.class, Integer.TYPE, C14410c.f134472c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        TaxAreaLookup taxAreaLookupNewInstance = declaredConstructor.newInstance(strFromJson, strFromJson2, postalAddressFromJson, Integer.valueOf(i10), null);
        Intrinsics.i(taxAreaLookupNewInstance, "newInstance(...)");
        return taxAreaLookupNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, TaxAreaLookup value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("asOfDate");
        this.nullableStringAdapter.toJson(writer, (q) value_.getAsOfDate());
        writer.l("lookupId");
        this.nullableStringAdapter.toJson(writer, (q) value_.getLookupId());
        writer.l("PostalAddress");
        this.nullablePostalAddressAdapter.toJson(writer, (q) value_.getPostalAddress());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("TaxAreaLookup");
        sb2.append(')');
        return sb2.toString();
    }
}
