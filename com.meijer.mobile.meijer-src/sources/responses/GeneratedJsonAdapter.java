package responses;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.C14410c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lresponses/TaxAreaResultJsonAdapter;", "Lcom/squareup/moshi/h;", "Lresponses/TaxAreaResult;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lresponses/TaxAreaResult;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lresponses/TaxAreaResult;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "nullableStringAdapter", "Lcom/squareup/moshi/h;", "", "Lresponses/Jurisdiction;", "nullableListOfJurisdictionAdapter", "Lresponses/PostalAddress;", "nullablePostalAddressAdapter", "Lresponses/AddressCleansingResultMessage;", "nullableAddressCleansingResultMessageAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "validation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: responses.TaxAreaResultJsonAdapter, reason: from toString */
/* loaded from: classes14.dex */
public final class GeneratedJsonAdapter extends h<TaxAreaResult> {
    private volatile Constructor<TaxAreaResult> constructorRef;
    private final h<AddressCleansingResultMessage> nullableAddressCleansingResultMessageAdapter;
    private final h<List<Jurisdiction>> nullableListOfJurisdictionAdapter;
    private final h<PostalAddress> nullablePostalAddressAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("taxAreaId", "asOfDate", "confidenceIndicator", "Jurisdiction", "PostalAddress", "AddressCleansingResultMessage");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, SetsKt.e(), "taxAreaId");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableStringAdapter = hVarF;
        h<List<Jurisdiction>> hVarF2 = moshi.f(x.j(List.class, Jurisdiction.class), SetsKt.e(), "jurisdiction");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableListOfJurisdictionAdapter = hVarF2;
        h<PostalAddress> hVarF3 = moshi.f(PostalAddress.class, SetsKt.e(), "postalAddress");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullablePostalAddressAdapter = hVarF3;
        h<AddressCleansingResultMessage> hVarF4 = moshi.f(AddressCleansingResultMessage.class, SetsKt.e(), "addressCleansingResultMessage");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.nullableAddressCleansingResultMessageAdapter = hVarF4;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public TaxAreaResult fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        int i10 = -1;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        List<Jurisdiction> listFromJson = null;
        PostalAddress postalAddressFromJson = null;
        AddressCleansingResultMessage addressCleansingResultMessageFromJson = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -2;
                    break;
                case 1:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    listFromJson = this.nullableListOfJurisdictionAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    postalAddressFromJson = this.nullablePostalAddressAdapter.fromJson(reader);
                    break;
                case 5:
                    addressCleansingResultMessageFromJson = this.nullableAddressCleansingResultMessageAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
            }
        }
        reader.d();
        if (i10 == -48) {
            AddressCleansingResultMessage addressCleansingResultMessage = addressCleansingResultMessageFromJson;
            PostalAddress postalAddress = postalAddressFromJson;
            List<Jurisdiction> list = listFromJson;
            return new TaxAreaResult(strFromJson, strFromJson2, strFromJson3, list, postalAddress, addressCleansingResultMessage);
        }
        AddressCleansingResultMessage addressCleansingResultMessage2 = addressCleansingResultMessageFromJson;
        PostalAddress postalAddress2 = postalAddressFromJson;
        List<Jurisdiction> list2 = listFromJson;
        String str = strFromJson3;
        String str2 = strFromJson2;
        String str3 = strFromJson;
        Constructor<TaxAreaResult> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = TaxAreaResult.class.getDeclaredConstructor(String.class, String.class, String.class, List.class, PostalAddress.class, AddressCleansingResultMessage.class, Integer.TYPE, C14410c.f134472c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        TaxAreaResult taxAreaResultNewInstance = declaredConstructor.newInstance(str3, str2, str, list2, postalAddress2, addressCleansingResultMessage2, Integer.valueOf(i10), null);
        Intrinsics.i(taxAreaResultNewInstance, "newInstance(...)");
        return taxAreaResultNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, TaxAreaResult value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("taxAreaId");
        this.nullableStringAdapter.toJson(writer, (q) value_.getTaxAreaId());
        writer.l("asOfDate");
        this.nullableStringAdapter.toJson(writer, (q) value_.getAsOfDate());
        writer.l("confidenceIndicator");
        this.nullableStringAdapter.toJson(writer, (q) value_.getConfidenceIndicator());
        writer.l("Jurisdiction");
        this.nullableListOfJurisdictionAdapter.toJson(writer, (q) value_.d());
        writer.l("PostalAddress");
        this.nullablePostalAddressAdapter.toJson(writer, (q) value_.getPostalAddress());
        writer.l("AddressCleansingResultMessage");
        this.nullableAddressCleansingResultMessageAdapter.toJson(writer, (q) value_.getAddressCleansingResultMessage());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("TaxAreaResult");
        sb2.append(')');
        return sb2.toString();
    }
}
