package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyCompat;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription;
import com.scandit.datacapture.core.data.Range;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\"\u001a\u00020\u0003H\u0097\u0001J\t\u0010#\u001a\u00020\fH\u0097\u0001R\u0014\u0010\u0005\u001a\u00020\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00108WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/barcode/data/SymbologyDescription;", "Lcom/scandit/datacapture/barcode/data/SymbologyDescriptionProxy;", "impl", "Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeSymbologyDescription;", "(Lcom/scandit/datacapture/barcode/internal/sdk/data/NativeSymbologyDescription;)V", "activeSymbolCountRange", "Lcom/scandit/datacapture/core/data/Range;", "getActiveSymbolCountRange", "()Lcom/scandit/datacapture/core/data/Range;", "defaultSymbolCountRange", "getDefaultSymbolCountRange", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "isAvailable", "", "()Z", "isColorInvertible", "readableName", "getReadableName", "supportedChecksums", "Ljava/util/EnumSet;", "Lcom/scandit/datacapture/barcode/data/Checksum;", "getSupportedChecksums", "()Ljava/util/EnumSet;", "supportedExtensions", "", "getSupportedExtensions", "()Ljava/util/Set;", "symbology", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getSymbology", "()Lcom/scandit/datacapture/barcode/data/Symbology;", "_impl", "toJson", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Mockable
/* loaded from: classes11.dex */
public final class SymbologyDescription implements SymbologyDescriptionProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SymbologyDescriptionProxyAdapter f120913a;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/data/SymbologyDescription$Companion;", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "symbology", "Lcom/scandit/datacapture/barcode/data/SymbologyDescription;", "create", "(Lcom/scandit/datacapture/barcode/data/Symbology;)Lcom/scandit/datacapture/barcode/data/SymbologyDescription;", "", "identifier", "forIdentifier", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/data/SymbologyDescription;", "", "all", "()Ljava/util/List;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class Companion {
        @JvmStatic
        public final SymbologyDescription create(Symbology symbology) {
            Intrinsics.j(symbology, "symbology");
            NativeSymbologyDescription nativeSymbologyDescriptionCreate = NativeSymbologyDescription.create(symbology);
            Intrinsics.i(nativeSymbologyDescriptionCreate, "create(...)");
            return new SymbologyDescription(nativeSymbologyDescriptionCreate);
        }

        @JvmStatic
        public final SymbologyDescription forIdentifier(String identifier) {
            Intrinsics.j(identifier, "identifier");
            NativeSymbologyDescription nativeSymbologyDescriptionSymbologyDescriptionFromIdentifier = NativeSymbologyDescription.symbologyDescriptionFromIdentifier(identifier);
            if (nativeSymbologyDescriptionSymbologyDescriptionFromIdentifier != null) {
                return new SymbologyDescription(nativeSymbologyDescriptionSymbologyDescriptionFromIdentifier);
            }
            return null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final List<SymbologyDescription> all() {
            ArrayList<Symbology> arrayListAll = NativeSymbologyCompat.all();
            Intrinsics.i(arrayListAll, "all(...)");
            ArrayList arrayList = new ArrayList(CollectionsKt.x(arrayListAll, 10));
            for (Symbology symbology : arrayListAll) {
                Companion companion = SymbologyDescription.INSTANCE;
                Intrinsics.g(symbology);
                arrayList.add(companion.create(symbology));
            }
            return arrayList;
        }
    }

    @JvmStatic
    public static final List<SymbologyDescription> all() {
        return INSTANCE.all();
    }

    @JvmStatic
    public static final SymbologyDescription create(Symbology symbology) {
        return INSTANCE.create(symbology);
    }

    @JvmStatic
    public static final SymbologyDescription forIdentifier(String str) {
        return INSTANCE.forIdentifier(str);
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeSymbologyDescription getF120914a() {
        return this.f120913a.getF120914a();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(property = "activeSymbolCountRange")
    public Range getActiveSymbolCountRange() {
        return this.f120913a.getActiveSymbolCountRange();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(property = "defaultSymbolCountRange")
    public Range getDefaultSymbolCountRange() {
        return this.f120913a.getDefaultSymbolCountRange();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(property = "identifier")
    public String getIdentifier() {
        return this.f120913a.getIdentifier();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(property = "readableName")
    public String getReadableName() {
        return this.f120913a.getReadableName();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(property = "symbology")
    public Symbology getSymbology() {
        return this.f120913a.getSymbology();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(property = "isAvailable")
    public boolean isAvailable() {
        return this.f120913a.isAvailable();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(property = "isColorInvertible")
    public boolean isColorInvertible() {
        return this.f120913a.isColorInvertible();
    }

    @Override // com.scandit.datacapture.barcode.data.SymbologyDescriptionProxy
    @ProxyFunction(nativeName = "toJson")
    public String toJson() {
        return this.f120913a.toJson();
    }

    public SymbologyDescription(NativeSymbologyDescription impl) {
        Intrinsics.j(impl, "impl");
        this.f120913a = new SymbologyDescriptionProxyAdapter(impl, null, 2, null);
    }

    public final EnumSet<Checksum> getSupportedChecksums() {
        EnumSet<Checksum> supportedChecksumsBits = getF120914a().getSupportedChecksumsBits();
        Intrinsics.i(supportedChecksumsBits, "getSupportedChecksumsBits(...)");
        return supportedChecksumsBits;
    }

    public final Set<String> getSupportedExtensions() {
        HashSet<String> publicExtensions = getF120914a().getPublicExtensions();
        Intrinsics.i(publicExtensions, "getPublicExtensions(...)");
        return publicExtensions;
    }
}
