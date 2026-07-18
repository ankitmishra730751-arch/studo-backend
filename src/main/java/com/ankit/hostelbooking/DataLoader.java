package com.ankit.hostelbooking;

import com.ankit.hostelbooking.entity.Hostel;
import com.ankit.hostelbooking.repository.HostelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final HostelRepository hostelRepository;

    public DataLoader(HostelRepository hostelRepository) {
        this.hostelRepository = hostelRepository;
    }

    @Override
    public void run(String... args) {

        if (hostelRepository.count() > 0) {
            return;
        }
        Hostel hostel1 = new Hostel();

        hostel1.setName("Neha Flats");
        hostel1.setCity("Mathura");
        hostel1.setLocation("Near GLA University, Mathura");

        hostel1.setPrice(12000.0);
        hostel1.setRent("₹12,000 / Month");

        hostel1.setImageUrl("https://res.cloudinary.com/ktatmqjd/image/upload/v1784145180/neha-flats-2.jpg_ysu3jo.jpg");

        hostel1.setGalleryImages(
                "https://res.cloudinary.com/ktatmqjd/image/upload/v1784145180/neha-flats-2.jpg_ysu3jo.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784145182/neha-flats-1.jpg_w9uyic.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784145179/neha-flats-3.jpg_eidk1p.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784145178/neha-flats-4.jpg_tzdwzf.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784145174/neha-flats-6.jpg_cetaud.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784145173/neha-flats-9.jpg_n8vo63.jpg"
        );

        hostel1.setRating("4.8");
        hostel1.setReviews("96 Reviews");
        hostel1.setDistance("5 Min Away from GLA University");

        hostel1.setHostelType("Boys,Girls,Family");
        hostel1.setSharingType("Single,Double,Triple");
        hostel1.setMess("Mess Not Included");

        hostel1.setOwnerPhone("9058926490");

        hostel1.setFacilities("Free WiFi, AC, RO Water, CCTV Security, Power Backup, Parking, Attached Bathroom");

        hostel1.setDescription(
                "Neha Flats is one of the most comfortable and well-maintained accommodations near GLA University, Mathura. " +
                        "It is suitable for boys, girls, and families. The property offers spacious rooms with modern facilities " +
                        "including high-speed WiFi, AC, RO drinking water, CCTV security, power backup, attached bathrooms, and hygienic " +
                        "mess services. Located just 5 minutes from GLA University, Neha Flats provides a peaceful, clean, and secure " +
                        "environment, making it an excellent choice for students and working professionals."
        );

        hostelRepository.save(hostel1);
        Hostel hostel2 = new Hostel();

        hostel2.setName("Cozy Girls Hostel");
        hostel2.setCity("Mathura");
        hostel2.setLocation("Near GLA University, Mathura");

        hostel2.setPrice(10000.0);
        hostel2.setRent("₹10,000 / Month (₹1,00,000 / Year)");

        hostel2.setImageUrl("https://res.cloudinary.com/ktatmqjd/image/upload/v1784145623/Cozy-girls-hostels-1.jpg_z7tg5s.jpg");

        hostel2.setGalleryImages(
                "https://res.cloudinary.com/ktatmqjd/image/upload/v1784145623/Cozy-girls-hostels-1.jpg_z7tg5s.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784145651/Cozy-girls-hostels-3.jpg_efckeg.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784145652/Cozy-girls-hostels-2.jpg_syzitx.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784145650/Cozy-girls-hostels-4.jpg_xzqumz.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784145648/Cozy-girls-hostels-5.jpg_n52tl2.jpg"
        );

        hostel2.setRating("4.7");
        hostel2.setReviews("95 Reviews");
        hostel2.setDistance("2 Min Away from GLA University");

        hostel2.setHostelType("Girls");
        hostel2.setSharingType("Double,Triple");
        hostel2.setMess("Mess Included");

        hostel2.setOwnerPhone("8679691985");

        hostel2.setFacilities("Free WiFi, AC, RO Water, CCTV Security, Power Backup, Parking, Attached Bathroom, Mess Available");

        hostel2.setDescription(
                "Cozy Girls Hostel is a safe, comfortable, and well-maintained accommodation specially designed for girl students near GLA University, Mathura. " +
                        "The hostel provides a secure environment with 24×7 CCTV surveillance, attached bathrooms, high-speed WiFi, AC rooms, RO drinking water, " +
                        "power backup, and hygienic mess facilities. Double and Triple Sharing rooms are spacious, clean, and regularly maintained. " +
                        "Located just 2 minutes from GLA University, it offers a peaceful atmosphere with a strong focus on safety, cleanliness, and comfort, " +
                        "making it one of the best choices for girl students."
        );

        hostelRepository.save(hostel2);
        Hostel hostel3 = new Hostel();

        hostel3.setName("Rana Boys Hostel");
        hostel3.setCity("Mathura");
        hostel3.setLocation("Near GLA University, Mathura");

        hostel3.setPrice(8500.0);
        hostel3.setRent("Non AC : ₹8,500 / Month | AC : ₹10,000 / Month");

        hostel3.setImageUrl("https://res.cloudinary.com/ktatmqjd/image/upload/v1784146187/rana-boys-hostels-1.jpg_obatjc.jpg");

        hostel3.setGalleryImages(
                "https://res.cloudinary.com/ktatmqjd/image/upload/v1784146187/rana-boys-hostels-1.jpg_obatjc.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784146181/rana-boys-hostels-5.jpg_hbksnk.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784146183/rana-boys-hostels-3.jpg_x52k6i.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784199542/rana-boys-hostel-6.jpg_o1cvbd.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784199542/rana-boys-hostel-7.jpg_wnknrp.jpg"
        );

        hostel3.setRating("4.6");
        hostel3.setReviews("88 Reviews");
        hostel3.setDistance("2 Min Away from GLA University");

        hostel3.setHostelType("Boys");
        hostel3.setSharingType("Double,Triple");
        hostel3.setMess("Mess Included");

        hostel3.setOwnerPhone("9812343400");

        hostel3.setFacilities("Free WiFi, AC, RO Water, CCTV Security, Power Backup, Parking, Attached Bathroom, Mess Available");

        hostel3.setDescription(
                "Rana Boys Hostel is one of the most trusted and well-maintained accommodations for boys near GLA University, Mathura. Home to more than 100 students, the hostel offers a friendly, disciplined, and comfortable environment that helps students focus on their studies. The hostel provides spacious AC and Non-AC rooms in Double and Triple Sharing options at affordable prices. Students enjoy high-speed WiFi, RO drinking water, hygienic mess facilities, 24×7 CCTV surveillance, attached bathrooms, power backup, and parking. Located just 2 minutes from GLA University, the hostel ensures quick access to campus while maintaining a peaceful atmosphere. With excellent cleanliness, supportive management, and a secure environment, Rana Boys Hostel is an ideal choice for students looking for a safe and comfortable stay during their academic journey."
        );

        hostelRepository.save(hostel3);
        Hostel hostel4 = new Hostel();

        hostel4.setName("Vaishnavi Boys Hostel");
        hostel4.setCity("Mathura");
        hostel4.setLocation("Near GLA University, Mathura");

        hostel4.setPrice(5000.0);
        hostel4.setRent("₹5,000 / Month");

        hostel4.setImageUrl("https://res.cloudinary.com/ktatmqjd/image/upload/v1784262084/Vaishnavi-Boys-Hostel-1.jpg_cn0fsb.jpg");

        hostel4.setGalleryImages(
                "https://res.cloudinary.com/ktatmqjd/image/upload/v1784262084/Vaishnavi-Boys-Hostel-1.jpg_cn0fsb.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784262084/Vaishnavi-Boys-Hostel-2.jpg_txxtlb.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784262083/Vaishnavi-Boys-Hostel-3.jpg_bixtr3.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784262083/Vaishnavi-Boys-Hostel-4.jpg_lurlv9.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784262083/Vaishnavi-Boys-Hostel-5.jpg_mw3rzq.jpg"
        );

        hostel4.setRating("4.7");
        hostel4.setReviews("102 Reviews");
        hostel4.setDistance("2 Min Away from GLA University");

        hostel4.setHostelType("Boys");
        hostel4.setSharingType("Double");
        hostel4.setMess("Mess Not Included");

        hostel4.setOwnerPhone("7533843905");

        hostel4.setFacilities("Free WiFi, AC, RO Water, CCTV Security, Power Backup, Parking, Attached Bathroom");

        hostel4.setDescription(
                "Vaishnavi Boys Hostel is a newly constructed hostel near GLA University, Mathura, offering modern rooms and a comfortable living experience for students. The hostel provides a clean, peaceful, and secure environment with 24×7 CCTV surveillance, high-speed WiFi, RO drinking water, power backup, parking, laundry facilities, and attached bathrooms. Double Sharing rooms are spacious, well-ventilated, and designed to provide maximum comfort for students. Located just 2 minutes from GLA University, the hostel allows students to reach campus quickly while enjoying a safe and friendly atmosphere. Being a newly built property, the rooms and facilities are well-maintained, making it an excellent choice for students looking for quality accommodation at an affordable price."
        );

        hostelRepository.save(hostel4);
        Hostel hostel5 = new Hostel();

        hostel5.setName("Neha Girls Hostel");
        hostel5.setCity("Mathura");
        hostel5.setLocation("Near GLA University, Mathura");

        hostel5.setPrice(3500.0);
        hostel5.setRent("₹3,500 / Month (Non AC) | ₹4,500 + Electricity (AC)");

        hostel5.setImageUrl("https://res.cloudinary.com/ktatmqjd/image/upload/v1784264070/Neha-Girls-Hostel-1.jpg_qm1q4l.jpg");

        hostel5.setGalleryImages(
                "https://res.cloudinary.com/ktatmqjd/image/upload/v1784264070/Neha-Girls-Hostel-1.jpg_qm1q4l.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784264071/Neha-Girls-Hostel-2.jpg_l1m89w.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784264070/Neha-Girls-Hostel-3.jpg_tv4i9a.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784264070/Neha-Girls-Hostel-4.jpg_wspnwh.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784264069/Neha-Girls-Hostel-5.jpg_nyssxr.jpg"
        );

        hostel5.setRating("4.7");
        hostel5.setReviews("89 Reviews");
        hostel5.setDistance("5 Min Away from GLA University");

        hostel5.setHostelType("Girls");
        hostel5.setSharingType("Single,Double,Triple");
        hostel5.setMess("Mess Available");

        hostel5.setOwnerPhone("9058926490");

        hostel5.setFacilities("Free WiFi, AC, RO Water, CCTV Security, Power Backup, Parking, Attached Bathroom, Mess Available");

        hostel5.setDescription(
                "Neha Girls Hostel is a safe and comfortable accommodation located just 5 minutes from GLA University, Mathura. The hostel is specially designed for girls and provides a secure, family-friendly environment. The owner's family lives on the premises, ensuring students receive continuous support and care. In case of any emergency, medical assistance is available 24×7. The hostel offers WiFi, RO drinking water, CCTV surveillance, power backup, parking, attached bathrooms, and both AC and Non-AC rooms with Single, Double, and Triple Sharing options. Its peaceful atmosphere and focus on student safety make it an excellent choice for girls studying at GLA University."
        );

        hostelRepository.save(hostel5);
        Hostel hostel6 = new Hostel();

        hostel6.setName("Shree Govindam Chhatrawas Nivas");
        hostel6.setCity("Mathura");
        hostel6.setLocation("Near GLA University, Mathura");

        hostel6.setPrice(9000.0);
        hostel6.setRent("₹9,000 / Month (Non AC) | AC ₹9,000 + Electricity Bill");

        hostel6.setImageUrl("https://res.cloudinary.com/ktatmqjd/image/upload/v1784266749/Shree-Govindam-Chhatrawas-Nivas-1.jpg_a7cos8.jpg");

        hostel6.setGalleryImages(
                "https://res.cloudinary.com/ktatmqjd/image/upload/v1784266749/Shree-Govindam-Chhatrawas-Nivas-1.jpg_a7cos8.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784266809/Shree-Govindam-Chhatrawas-Nivas-2.jpg_fdiisg.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784266808/Shree-Govindam-Chhatrawas-Nivas-4.jpg_kkfmso.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784266808/Shree-Govindam-Chhatrawas-Nivas-3.jpg_qlcjrh.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784266805/Shree-Govindam-Chhatrawas-Nivas-5.jpg_fkdmy7.jpg"
        );

        hostel6.setRating("4.7");
        hostel6.setReviews("102 Reviews");
        hostel6.setDistance("4 Min Away from GLA University");

        hostel6.setHostelType("Boys");
        hostel6.setSharingType("Single,Double");
        hostel6.setMess("Mess Included");

        hostel6.setOwnerPhone("8920877022");

        hostel6.setFacilities("Free WiFi, AC, RO Water, CCTV Security, Power Backup, Parking, Attached Bathroom, Mess Available");

        hostel6.setDescription(
                "Shree Govindam Chhatrawas Nivas is a well-maintained boys hostel located just 4 minutes from GLA University, Mathura. The hostel offers a peaceful, safe, and student-friendly environment with 24×7 CCTV surveillance and warden support. It provides high-speed WiFi, RO drinking water, power backup, parking, attached bathrooms, and hygienic mess facilities. A special feature of this hostel is the availability of sweet water for bathing, making daily use more comfortable. Students staying in Non-AC rooms are also provided with coolers during the summer season for added comfort. With Single and Double Sharing options, this hostel is an excellent choice for students looking for quality accommodation near the university."
        );

        hostelRepository.save(hostel6);
        Hostel hostel7 = new Hostel();

        hostel7.setName("LA LA LAND");
        hostel7.setCity("Mathura");
        hostel7.setLocation("Near GLA University, Mathura");

        hostel7.setPrice(5000.0);
        hostel7.setRent("₹5,000 / Month");

        hostel7.setImageUrl("https://res.cloudinary.com/ktatmqjd/image/upload/v1784354962/La-La-Land-Boys-hostel-2.jpg_mxjs5a.jpg");

        hostel7.setGalleryImages(
                "https://res.cloudinary.com/ktatmqjd/image/upload/v1784354962/La-La-Land-Boys-hostel-2.jpg_mxjs5a.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784354963/La-La-Land-Boys-hostel-1.jpg_dn5uww.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784354963/La-La-Land-Boys-hostel-3.jpg_s39i5r.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784354963/La-La-Land-Boys-hostel-4.jpg_dc9vxn.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784354963/La-La-Land-Boys-hostel-5.jpg_tvawnf.jpg"
        );

        hostel7.setRating("4.8");
        hostel7.setReviews("104 Reviews");
        hostel7.setDistance("2 Min Away from GLA University");

        hostel7.setHostelType("Boys");
        hostel7.setSharingType("Double,Triple");
        hostel7.setMess("Mess Not Included");

        hostel7.setOwnerPhone("9501906552");

        hostel7.setFacilities("Free WiFi, AC, RO Water, CCTV Security, Power Backup, Parking, Attached Bathroom");

        hostel7.setDescription(
                "LA LA LAND is a newly constructed boys hostel located just 2 minutes from GLA University, Mathura. Designed with modern facilities and student comfort in mind, the hostel offers clean and spacious Double and Triple Sharing rooms with attached bathrooms. Students enjoy high-speed WiFi, RO drinking water, CCTV security, power backup, parking, and laundry facilities, including washing machines for daily convenience. Popular restaurants and cafés are located nearby, making it easy for students to access food and hangout spots. With its fresh infrastructure, safe environment, and excellent location, LA LA LAND is a great choice for students looking for comfortable and affordable accommodation near GLA University."
        );

        hostelRepository.save(hostel7);
        Hostel hostel8 = new Hostel();

        hostel8.setName("AV Boys Hostel");
        hostel8.setCity("Mathura");
        hostel8.setLocation("Front of GLA University, Mathura");

        hostel8.setPrice(80000.0);
        hostel8.setRent("₹80,000 / Year (Non AC) | ₹1,20,000 / Year (AC)");

        hostel8.setImageUrl("https://res.cloudinary.com/ktatmqjd/image/upload/v1784357002/Av-Boys-Hostel-1.jpg_ifzu05.jpg");

        hostel8.setGalleryImages(
                "https://res.cloudinary.com/ktatmqjd/image/upload/v1784357002/Av-Boys-Hostel-1.jpg_ifzu05.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784357001/Av-Boys-Hostel-2.jpg_kvntbe.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784357001/Av-Boys-Hostel-3.jpg_dzjxkr.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784357000/Av-Boys-Hostel-4.jpg_tcivjr.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784357000/Av-Boys-Hostel-5.jpg_hycyxh.jpg"
        );

        hostel8.setRating("4.8");
        hostel8.setReviews("99 Reviews");
        hostel8.setDistance("Front of GLA University");

        hostel8.setHostelType("Boys");
        hostel8.setSharingType("Double");
        hostel8.setMess("Mess Included");

        hostel8.setOwnerPhone("8755774015");

        hostel8.setFacilities("Free WiFi, AC, RO Water, CCTV Security, Power Backup, Parking, Attached Bathroom, Mess Available");

        hostel8.setDescription(
                "AV Boys Hostel is located directly in front of GLA University, making it one of the most convenient accommodation options for students. The hostel offers Double Sharing rooms with both AC and Non-AC options. Students are provided with high-speed WiFi, RO drinking water, CCTV security, power backup, parking, laundry facilities, and hygienic mess services. The hostel has clean and well-maintained common bathrooms and toilets that are regularly cleaned for students' comfort. Its excellent location allows students to reach the university within a few minutes on foot, making it an ideal choice for those who prefer to stay very close to the campus."
        );

        hostelRepository.save(hostel8);
        Hostel hostel9 = new Hostel();

        hostel9.setName("Ladli Ji Girls Hostel");
        hostel9.setCity("Mathura");
        hostel9.setLocation("Near GLA University, Mathura");

        hostel9.setPrice(7500.0);
        hostel9.setRent("₹7,500 / Month");

        hostel9.setImageUrl("https://res.cloudinary.com/ktatmqjd/image/upload/v1784358779/Ladli-Ji-Girls-Hostel-1.jpg_nnshff.jpg");

        hostel9.setGalleryImages(
                "https://res.cloudinary.com/ktatmqjd/image/upload/v1784358779/Ladli-Ji-Girls-Hostel-1.jpg_nnshff.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784358777/Ladli-Ji-Girls-Hostel-2.jpg_qz93ig.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784358776/Ladli-Ji-Girls-Hostel-3.jpg_qwkx9v.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784358775/Ladli-Ji-Girls-Hostel-4.jpg_tzg6kz.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784358775/Ladli-Ji-Girls-Hostel-5.jpg_huv5zs.jpg"
        );

        hostel9.setRating("4.7");
        hostel9.setReviews("96 Reviews");
        hostel9.setDistance("2 Min Away from GLA University");

        hostel9.setHostelType("Girls");
        hostel9.setSharingType("Double,Triple");
        hostel9.setMess("Mess Included");

        hostel9.setOwnerPhone("9634246561");

        hostel9.setFacilities("Free WiFi, AC, RO Water, CCTV Security, Power Backup, Parking, Attached Bathroom, Mess Available");

        hostel9.setDescription(
                "Ladli Ji Girls Hostel is a secure and comfortable accommodation located just 2 minutes from GLA University, Mathura. The hostel is specially designed for girls and provides a safe, family-oriented environment where the owner's family lives on the premises, ensuring continuous care and supervision. Students benefit from 24×7 CCTV surveillance, WiFi, RO drinking water, power backup, parking, laundry facilities, hygienic mess services, and attached bathrooms. Double and Triple Sharing rooms are clean, spacious, and well-maintained. With its focus on safety, comfort, and a peaceful atmosphere, Ladli Ji Girls Hostel is an excellent choice for girls studying at GLA University."
        );

        hostelRepository.save(hostel9);
        Hostel hostel10 = new Hostel();

        hostel10.setName("Abhinandan Boys and Girls Hostel");
        hostel10.setCity("Mathura");
        hostel10.setLocation("Near GLA University, Mathura");

        hostel10.setPrice(90000.0);
        hostel10.setRent("₹90,000 / Year (Non AC) | AC ₹90,000 + Electricity Bill");

        hostel10.setImageUrl("https://res.cloudinary.com/ktatmqjd/image/upload/v1784361917/Abhinandan_Hostel-1.jpg_m4qads.jpg");

        hostel10.setGalleryImages(
                "https://res.cloudinary.com/ktatmqjd/image/upload/v1784361917/Abhinandan_Hostel-1.jpg_m4qads.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784361915/Abhinandan_Hostel-2.jpg_r9v0dx.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784361913/Abhinandan_Hostel-3.jpg_hhqnu9.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784361911/Abhinandan_Hostel-4.jpg_vho8rf.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784361910/Abhinandan_Hostel-5.jpg_pnpynk.jpg," +
                        "https://res.cloudinary.com/ktatmqjd/image/upload/v1784361909/Abhinandan_Hostel-6.jpg_do3b3n.jpg"
        );

        hostel10.setRating("4.8");
        hostel10.setReviews("97 Reviews");
        hostel10.setDistance("5 Min Away from GLA University");

        hostel10.setHostelType("Boys,Girls");
        hostel10.setSharingType("Double");
        hostel10.setMess("Mess Included");

        hostel10.setOwnerPhone("8679251595");

        hostel10.setFacilities("Free WiFi, AC, RO Water, CCTV Security, Power Backup, Parking, Attached Bathroom, Mess Available, Swimming Pool, Garden, 24×7 Medical Assistance");

        hostel10.setDescription(
                "Abhinandan Boys and Girls Hostel is a modern hostel located just 5 minutes from GLA University, Mathura. The hostel provides separate accommodation for both boys and girls in a safe and student-friendly environment. It offers Double Sharing rooms with WiFi, RO drinking water, CCTV surveillance, power backup, parking, laundry facilities, hygienic mess services, and attached bathrooms. A unique feature of this hostel is its swimming pool and well-maintained garden, providing students with opportunities for relaxation and recreation. The hostel also offers 24×7 emergency medical assistance, ensuring students receive immediate support whenever required. With quality facilities, security, and a peaceful atmosphere, Abhinandan Boys and Girls Hostel is an excellent choice for students near GLA University."
        );

        hostelRepository.save(hostel10);
    }
}
