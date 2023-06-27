package vn.spring.api.business.application.product;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class GetRequestProductApplication {
	public GetRequestProductOutput start(GetRequestProductInput input) {
		GetRequestProductOutput output = GetRequestProductOutput.builder().build();
		return output;
	}

}
