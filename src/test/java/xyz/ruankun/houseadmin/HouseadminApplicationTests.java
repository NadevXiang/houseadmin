package xyz.ruankun.houseadmin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.ruankun.houseadmin.mapper.BannerMapper;
import xyz.ruankun.houseadmin.entity.Banner;

@SpringBootTest
class HouseadminApplicationTests {

	@Autowired
	BannerMapper bannerMapper;

	@Test
	void contextLoads() {
		Banner banner = new Banner();
		banner.setImgInfo("xx");
		banner.setImgUrl("httpsfdf");
		int rs = bannerMapper.add(banner);
		System.out.println(rs);
	}

}
