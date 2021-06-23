import java.util.Date;

public class Asn {
    private int id;
    private String nip;
    private String namaLengkap;
    private Date tanggalLahir;
    private Date tanggalDiangkat;
    private String jabatanFungsional;
    private String pangkatGolongan;
    private int tahunPengangkatan;


    public void melaksanakanApel(){
    }
    public void pelayananMasyarakat(){
    }
    public void merancanakanKegiatan(){
    }

    public Asn() {
    }

    public Asn(int id, String nip, String namaLengkap, Date tanggalLahir, Date tanggalDiangkat, String jabatanFungsional, String pangkatGolongan, int tahunPengangkatan) {
        this.id = id;
        this.nip = nip;
        this.namaLengkap = namaLengkap;
        this.tanggalLahir = tanggalLahir;
        this.tanggalDiangkat = tanggalDiangkat;
        this.jabatanFungsional = jabatanFungsional;
        this.pangkatGolongan = pangkatGolongan;
        this.tahunPengangkatan = tahunPengangkatan;
    }

    public Asn(int id, String nip, String namaLengkap) {
        this.id = id;
        this.nip = nip;
        this.namaLengkap = namaLengkap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Date getTanggalDiangkat() {
        return tanggalDiangkat;
    }

    public void setTanggalDiangkat(Date tanggalDiangkat) {
        this.tanggalDiangkat = tanggalDiangkat;
    }

    public String getJabatanFungsional() {
        return jabatanFungsional;
    }

    public void setJabatanFungsional(String jabatanFungsional) {
        this.jabatanFungsional = jabatanFungsional;
    }

    public String getPangkatGolongan() {
        return pangkatGolongan;
    }

    public void setPangkatGolongan(String pangkatGolongan) {
        this.pangkatGolongan = pangkatGolongan;
    }

    public int getTahunPengangkatan() {
        return tahunPengangkatan;
    }

    public void setTahunPengangkatan(int tahunPengangkatan) {
        this.tahunPengangkatan = tahunPengangkatan;
    }


}
