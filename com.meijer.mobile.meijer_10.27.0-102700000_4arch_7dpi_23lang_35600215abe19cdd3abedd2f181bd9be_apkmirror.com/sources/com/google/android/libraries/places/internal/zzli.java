package com.google.android.libraries.places.internal;

import Ce.L;

/* loaded from: classes6.dex */
final class zzli {
    private zza[] addressComponents;
    private String businessStatus;
    private Boolean curbsidePickup;
    private zzd currentOpeningHours;
    private Boolean delivery;
    private Boolean dineIn;
    private zzb editorialSummary;
    private String formattedAddress;
    private zzc geometry;
    private String icon;
    private String iconBackgroundColor;
    private String iconMaskBaseUri;
    private String internationalPhoneNumber;
    private String name;
    private zzd openingHours;
    private zze[] photos;
    private String placeId;
    private zzf plusCode;
    private Integer priceLevel;
    private Double rating;
    private Boolean reservable;
    private zzd[] secondaryOpeningHours;
    private Boolean servesBeer;
    private Boolean servesBreakfast;
    private Boolean servesBrunch;
    private Boolean servesDinner;
    private Boolean servesLunch;
    private Boolean servesVegetarianFood;
    private Boolean servesWine;
    private Boolean takeout;
    private String[] types;
    private Integer userRatingsTotal;
    private Integer utcOffset;
    private String website;
    private Boolean wheelchairAccessibleEntrance;

    class zza {
        private String longName;
        private String shortName;
        private String[] types;

        zza() {
        }

        final String zza() {
            return this.longName;
        }

        final String zzb() {
            return this.shortName;
        }

        final L zzc() {
            String[] strArr = this.types;
            return strArr != null ? L.t(strArr) : L.x();
        }
    }

    class zzb {
        private String language;
        private String overview;

        zzb() {
        }

        final String zza() {
            return this.language;
        }

        final String zzb() {
            return this.overview;
        }
    }

    class zzc {
        private zza location;
        private zzb viewport;

        class zza {
            private Double lat;
            private Double lng;

            zza() {
            }

            final Double zza() {
                return this.lat;
            }

            final Double zzb() {
                return this.lng;
            }
        }

        class zzb {
            private zza northeast;
            private zza southwest;

            zzb() {
            }

            final zza zza() {
                return this.northeast;
            }

            final zza zzb() {
                return this.southwest;
            }
        }

        zzc() {
        }

        final zza zza() {
            return this.location;
        }

        final zzb zzb() {
            return this.viewport;
        }
    }

    class zzd {
        private zza[] periods;
        private zzb[] specialDays;
        private String type;
        private String[] weekdayText;

        class zza {
            private zzc close;
            private zzc open;

            zza() {
            }

            final zzc zza() {
                return this.close;
            }

            final zzc zzb() {
                return this.open;
            }
        }

        class zzb {
            private String date;
            private Boolean exceptionalHours;

            zzb() {
            }

            final String zza() {
                return this.date;
            }

            final Boolean zzb() {
                return this.exceptionalHours;
            }
        }

        class zzc {
            private String date;
            private Integer day;
            private String time;
            private Boolean truncated;

            zzc() {
            }

            final Integer zza() {
                return this.day;
            }

            final String zzb() {
                return this.time;
            }

            final String zzc() {
                return this.date;
            }

            final Boolean zzd() {
                return this.truncated;
            }
        }

        zzd() {
        }

        final String zzc() {
            return this.type;
        }

        final L zza() {
            zza[] zzaVarArr = this.periods;
            return zzaVarArr != null ? L.t(zzaVarArr) : L.x();
        }

        final L zzb() {
            String[] strArr = this.weekdayText;
            return strArr != null ? L.t(strArr) : L.x();
        }

        final L zzd() {
            zzb[] zzbVarArr = this.specialDays;
            return zzbVarArr != null ? L.t(zzbVarArr) : L.x();
        }
    }

    class zze {
        private Integer height;
        private String[] htmlAttributions;
        private String photoReference;
        private Integer width;

        zze() {
        }

        final Integer zza() {
            return this.height;
        }

        final Integer zzb() {
            return this.width;
        }

        final String zzc() {
            return this.photoReference;
        }

        final L zzd() {
            String[] strArr = this.htmlAttributions;
            return strArr != null ? L.t(strArr) : L.x();
        }
    }

    class zzf {
        private String compoundCode;
        private String globalCode;

        zzf() {
        }

        final String zza() {
            return this.compoundCode;
        }

        final String zzb() {
            return this.globalCode;
        }
    }

    zzli() {
    }

    final Boolean zzA() {
        return this.servesWine;
    }

    final Boolean zzB() {
        return this.takeout;
    }

    final Integer zzD() {
        return this.userRatingsTotal;
    }

    final Integer zzE() {
        return this.utcOffset;
    }

    final String zzF() {
        return this.website;
    }

    final Boolean zzG() {
        return this.wheelchairAccessibleEntrance;
    }

    final String zzb() {
        return this.businessStatus;
    }

    final Boolean zzc() {
        return this.curbsidePickup;
    }

    final zzd zzd() {
        return this.currentOpeningHours;
    }

    final Boolean zze() {
        return this.delivery;
    }

    final Boolean zzf() {
        return this.dineIn;
    }

    final zzb zzg() {
        return this.editorialSummary;
    }

    final String zzh() {
        return this.formattedAddress;
    }

    final zzc zzi() {
        return this.geometry;
    }

    final String zzj() {
        return this.iconBackgroundColor;
    }

    final String zzk() {
        return this.iconMaskBaseUri;
    }

    final String zzl() {
        return this.internationalPhoneNumber;
    }

    final String zzm() {
        return this.name;
    }

    final zzd zzn() {
        return this.openingHours;
    }

    final String zzp() {
        return this.placeId;
    }

    final zzf zzq() {
        return this.plusCode;
    }

    final Integer zzr() {
        return this.priceLevel;
    }

    final Double zzs() {
        return this.rating;
    }

    final Boolean zzt() {
        return this.reservable;
    }

    final Boolean zzv() {
        return this.servesBeer;
    }

    final Boolean zzw() {
        return this.servesBreakfast;
    }

    final Boolean zzx() {
        return this.servesDinner;
    }

    final Boolean zzy() {
        return this.servesLunch;
    }

    final Boolean zzz() {
        return this.servesVegetarianFood;
    }

    final L zzC() {
        String[] strArr = this.types;
        return strArr != null ? L.t(strArr) : L.x();
    }

    final L zza() {
        zza[] zzaVarArr = this.addressComponents;
        return zzaVarArr != null ? L.t(zzaVarArr) : L.x();
    }

    final L zzo() {
        zze[] zzeVarArr = this.photos;
        return zzeVarArr != null ? L.t(zzeVarArr) : L.x();
    }

    final L zzu() {
        zzd[] zzdVarArr = this.secondaryOpeningHours;
        return zzdVarArr != null ? L.t(zzdVarArr) : L.x();
    }
}
