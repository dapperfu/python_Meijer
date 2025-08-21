package Rg;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private final List<int[]> f32599a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f32600b = new ArrayList();

    private synchronized void b() {
        if (this.f32599a.isEmpty()) {
            a(new int[]{0, 19}, "US/CA");
            a(new int[]{30, 39}, "US");
            a(new int[]{60, 139}, "US/CA");
            a(new int[]{HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 379}, "FR");
            a(new int[]{380}, "BG");
            a(new int[]{383}, "SI");
            a(new int[]{385}, "HR");
            a(new int[]{387}, "BA");
            a(new int[]{HttpResponseStatus.ERROR_BAD_REQUEST, 440}, "DE");
            a(new int[]{450, 459}, "JP");
            a(new int[]{460, 469}, "RU");
            a(new int[]{471}, "TW");
            a(new int[]{474}, "EE");
            a(new int[]{475}, "LV");
            a(new int[]{476}, "AZ");
            a(new int[]{477}, "LT");
            a(new int[]{478}, "UZ");
            a(new int[]{479}, "LK");
            a(new int[]{480}, "PH");
            a(new int[]{481}, "BY");
            a(new int[]{482}, "UA");
            a(new int[]{484}, "MD");
            a(new int[]{485}, "AM");
            a(new int[]{486}, "GE");
            a(new int[]{487}, "KZ");
            a(new int[]{489}, "HK");
            a(new int[]{490, 499}, "JP");
            a(new int[]{HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR, 509}, "GB");
            a(new int[]{520}, "GR");
            a(new int[]{528}, "LB");
            a(new int[]{529}, "CY");
            a(new int[]{531}, "MK");
            a(new int[]{535}, "MT");
            a(new int[]{539}, "IE");
            a(new int[]{540, 549}, "BE/LU");
            a(new int[]{560}, "PT");
            a(new int[]{569}, "IS");
            a(new int[]{570, 579}, "DK");
            a(new int[]{590}, "PL");
            a(new int[]{594}, "RO");
            a(new int[]{599}, "HU");
            a(new int[]{600, 601}, "ZA");
            a(new int[]{603}, "GH");
            a(new int[]{608}, "BH");
            a(new int[]{609}, "MU");
            a(new int[]{611}, "MA");
            a(new int[]{613}, "DZ");
            a(new int[]{616}, "KE");
            a(new int[]{618}, "CI");
            a(new int[]{619}, "TN");
            a(new int[]{621}, "SY");
            a(new int[]{622}, "EG");
            a(new int[]{624}, "LY");
            a(new int[]{625}, "JO");
            a(new int[]{626}, "IR");
            a(new int[]{627}, "KW");
            a(new int[]{628}, "SA");
            a(new int[]{629}, "AE");
            a(new int[]{640, 649}, "FI");
            a(new int[]{690, 695}, "CN");
            a(new int[]{700, 709}, "NO");
            a(new int[]{729}, "IL");
            a(new int[]{730, 739}, "SE");
            a(new int[]{740}, "GT");
            a(new int[]{741}, "SV");
            a(new int[]{742}, "HN");
            a(new int[]{743}, "NI");
            a(new int[]{744}, "CR");
            a(new int[]{745}, "PA");
            a(new int[]{746}, "DO");
            a(new int[]{750}, "MX");
            a(new int[]{754, 755}, "CA");
            a(new int[]{759}, "VE");
            a(new int[]{760, 769}, "CH");
            a(new int[]{770}, "CO");
            a(new int[]{773}, "UY");
            a(new int[]{775}, "PE");
            a(new int[]{777}, "BO");
            a(new int[]{779}, "AR");
            a(new int[]{780}, "CL");
            a(new int[]{784}, "PY");
            a(new int[]{785}, "PE");
            a(new int[]{786}, "EC");
            a(new int[]{789, 790}, "BR");
            a(new int[]{800, 839}, "IT");
            a(new int[]{840, 849}, "ES");
            a(new int[]{850}, "CU");
            a(new int[]{858}, "SK");
            a(new int[]{859}, "CZ");
            a(new int[]{860}, "YU");
            a(new int[]{865}, "MN");
            a(new int[]{867}, "KP");
            a(new int[]{868, 869}, "TR");
            a(new int[]{870, 879}, "NL");
            a(new int[]{880}, "KR");
            a(new int[]{885}, "TH");
            a(new int[]{888}, "SG");
            a(new int[]{890}, "IN");
            a(new int[]{893}, "VN");
            a(new int[]{896}, "PK");
            a(new int[]{899}, "ID");
            a(new int[]{900, 919}, "AT");
            a(new int[]{930, 939}, "AU");
            a(new int[]{940, 949}, "AZ");
            a(new int[]{955}, "MY");
            a(new int[]{958}, "MO");
        }
    }

    private void a(int[] iArr, String str) {
        this.f32599a.add(iArr);
        this.f32600b.add(str);
    }

    m() {
    }

    String c(String str) throws NumberFormatException {
        int[] iArr;
        int i10;
        b();
        int i11 = Integer.parseInt(str.substring(0, 3));
        int size = this.f32599a.size();
        for (int i12 = 0; i12 < size && i11 >= (i10 = (iArr = this.f32599a.get(i12))[0]); i12++) {
            if (iArr.length != 1) {
                i10 = iArr[1];
            }
            if (i11 <= i10) {
                return this.f32600b.get(i12);
            }
        }
        return null;
    }
}
